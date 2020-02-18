package com.target.nridataindex.service.impl;

import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.repository.NriIndexElasticRepository;
import com.target.nridataindex.service.NriIndexElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NriIndexElasticServiceImpl  implements NriIndexElasticService {

    private NriIndexElasticRepository nriIndexElasticRepository;


    @Autowired
    public void setNriIndexElasticRepository(NriIndexElasticRepository nriIndexElasticRepository) {
        this.nriIndexElasticRepository = nriIndexElasticRepository;
    }

    public NriItem save(NriItem nriItem) {
        return nriIndexElasticRepository.save(nriItem);
    }

    public Iterable<NriItem> findAll() {
        return nriIndexElasticRepository.findAll();
    }




}
