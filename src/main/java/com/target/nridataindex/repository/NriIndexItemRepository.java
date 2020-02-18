package com.target.nridataindex.repository;

import com.target.nridataindex.model.NriItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NriIndexItemRepository {

    @Select("select * from temp_json")
    public List<NriItem> findAll();

    @Select("SELECT * FROM temp_json WHERE tcin = #{tcin}")
    public NriItem findByTcin(String tcin);





}
