package com.target.nridataindex.service.impl;

import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.repository.NriIndexItemRepository;
import com.target.nridataindex.service.NriIndexItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NriIndexItemServiceImpl implements NriIndexItemService {

    @Autowired
    private NriIndexItemRepository nriIndexItemRepository;

    private static final Logger logger = LoggerFactory.getLogger(NriIndexItemServiceImpl.class);



    @Override
    public List<NriItem> findAll() {

        return nriIndexItemRepository.findAll();
    }

    @Override
    public NriItem findByTcin(String tcin) {
        return nriIndexItemRepository.findByTcin(tcin);
    }



}
