package com.target.nridataindex.service;

import com.target.nridataindex.model.NriItem;

import java.util.List;

public interface NriIndexElasticService {

    NriItem save(NriItem nriItem);

    Iterable<NriItem> findAll();







}
