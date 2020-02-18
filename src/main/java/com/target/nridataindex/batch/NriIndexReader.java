package com.target.nridataindex.batch;

import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.service.NriIndexItemService;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.List;

public class NriIndexReader implements ItemReader<NriItem> {


    NriIndexItemService nriIndexItemService;

    private int count = 0;

    public NriIndexReader(NriIndexItemService nriIndexItemService) {
        this.nriIndexItemService=nriIndexItemService;
    }

    @Override
    public NriItem read() throws Exception, UnexpectedInputException,
            ParseException, NonTransientResourceException {

        List<NriItem> nriItems = nriIndexItemService.findAll();

        if (count < nriItems.size()) {
            return nriItems.get(count++);
        } else {
            count = 0;
        }
        return null;
    }






}
