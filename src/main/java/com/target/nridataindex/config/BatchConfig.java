package com.target.nridataindex.config;

import com.target.nridataindex.batch.NriIndexProcessor;
import com.target.nridataindex.batch.NriIndexReader;
import com.target.nridataindex.batch.NriIndexWriter;
import com.target.nridataindex.listener.NriIndexJobCompletionListener;
import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.service.NriIndexElasticService;
import com.target.nridataindex.service.NriIndexItemService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;



public class BatchConfig {@Autowired
public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    NriIndexItemService nriIndexItemService;

    @Autowired
    private NriIndexElasticService nriIndexElasticService;


    @Bean
    public Job processJob() {
        return jobBuilderFactory.get("processJob")
                .incrementer(new RunIdIncrementer()).listener(listener())
                .flow(orderStep1()).end().build();
    }

    @Bean
    public Step orderStep1() {
        return stepBuilderFactory.get("orderStep1").<NriItem, NriItem> chunk(1)
                .reader(new NriIndexReader(nriIndexItemService)).processor(new NriIndexProcessor())
                .writer(new NriIndexWriter(nriIndexElasticService)).build();
    }




    @Bean
    public JobExecutionListener listener() {
        return new NriIndexJobCompletionListener();
    }

}