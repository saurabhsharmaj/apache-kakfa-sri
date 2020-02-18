package com.target.nridataindex.batch;

import com.target.nridataindex.model.NriItem;
import org.springframework.batch.item.ItemProcessor;

public class NriIndexProcessor  implements ItemProcessor <NriItem, NriItem> {

        @Override
        public NriItem process(NriItem nriItem) throws Exception {
            return nriItem;
        }

    }





