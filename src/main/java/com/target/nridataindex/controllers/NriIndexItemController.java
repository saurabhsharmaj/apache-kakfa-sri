package com.target.nridataindex.controllers;


import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.service.NriIndexItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NriIndexItemController {


    @Autowired
    NriIndexItemService nriIndexItemService;

    Integer id =0;

    @GetMapping("/getp")
    public @ResponseBody
    List<NriItem> getp() {
        return nriIndexItemService.findAll();

    }




}
