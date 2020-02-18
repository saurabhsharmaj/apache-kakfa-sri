package com.target.nridataindex.batch;

import com.target.nridataindex.model.NriItem;
import com.target.nridataindex.service.NriIndexElasticService;
import com.target.nridataindex.service.NriIndexItemService;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class NriIndexWriter implements ItemWriter<NriItem> {

  private NriIndexElasticService nriIndexElasticService;

  public NriIndexWriter(NriIndexElasticService nriIndexElasticService) {
    this.nriIndexElasticService = nriIndexElasticService;
  }

  @Override
  public void write(List<? extends NriItem> nriItems) throws Exception {
    for (NriItem nriItem : nriItems) {
      nriIndexElasticService.save(nriItem);
        }
     }
 }
