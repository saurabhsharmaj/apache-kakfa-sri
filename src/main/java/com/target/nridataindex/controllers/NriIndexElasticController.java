package com.target.nridataindex.controllers;

import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.service.NriIndexElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
public class NriIndexElasticController {


    @Autowired
    private NriIndexElasticService nriIndexElasticService;

    Integer id =0;

    @PostMapping("/adde")
    public @ResponseBody
    NriItem adde(@RequestBody NriItem nriItem) {
        return nriIndexElasticService.save(nriItem);
    }


    @GetMapping("/gete")
    public @ResponseBody Iterable<NriItem> gete() {
        return nriIndexElasticService.findAll();

    }





}
