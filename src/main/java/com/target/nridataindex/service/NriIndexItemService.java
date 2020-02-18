package com.target.nridataindex.service;

import com.target.nridataindex.model.NriItem;

import java.util.List;

public interface NriIndexItemService {

    public List<NriItem> findAll();

    public NriItem findByTcin(String tcin);



}
