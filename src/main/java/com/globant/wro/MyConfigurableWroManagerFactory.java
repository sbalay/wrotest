package com.globant.wro;

import java.util.Map;

import ro.isdc.wro.manager.factory.ConfigurableWroManagerFactory;
import ro.isdc.wro.model.resource.processor.ResourcePreProcessor;

public class MyConfigurableWroManagerFactory extends ConfigurableWroManagerFactory {
  protected void contributePreProcessors(Map<String, ResourcePreProcessor> map) {
    map.put("myPro", new MyProcessor());
  }

}
