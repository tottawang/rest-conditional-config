package com.sample.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.sample.filter.WindowsFilter;

@Configuration
@Conditional(WindowsCondition.class)
public class WindowConfig extends ResourceConfig {

  public WindowConfig() {
    register(WindowsFilter.class);
  }

}
