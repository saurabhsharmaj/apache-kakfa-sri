package com.target.nridataindex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "nrielastic", type = "nri_items")
public class NriItem {

    @Id
    private String id;

    private String item_data;

    private String tcin;


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getItem_data() {
        return item_data;
    }

    public void setItem_data(String item_data) {
        this.item_data = item_data;
    }

    public String getTcin() {
        return tcin;
    }

    public void setTcin(String tcin) {
        this.tcin = tcin;
    }



}
