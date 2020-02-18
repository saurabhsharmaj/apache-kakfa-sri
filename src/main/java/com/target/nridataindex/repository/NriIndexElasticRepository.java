package com.target.nridataindex.repository;

import com.target.nridataindex.model.NriItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

@Mapper
public interface NriIndexElasticRepository  extends ElasticsearchRepository<NriItem, String> {

        List<NriItem> findByTcin(String tcin);

}
