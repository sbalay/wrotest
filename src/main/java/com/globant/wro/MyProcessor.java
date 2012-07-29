package com.globant.wro;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import ro.isdc.wro.model.resource.Resource;
import ro.isdc.wro.model.resource.ResourceType;
import ro.isdc.wro.model.resource.SupportedResourceType;
import ro.isdc.wro.model.resource.processor.ResourcePreProcessor;

@SupportedResourceType(ResourceType.JS)
public class MyProcessor implements ResourcePreProcessor {

  public static String ALIAS = "myPro";

  public MyProcessor() {
  }

  public void process(Resource resource, Reader reader, Writer writer)
      throws IOException {
    writer.write("larala");
    System.out.println("paso por el processor");
  }

}
