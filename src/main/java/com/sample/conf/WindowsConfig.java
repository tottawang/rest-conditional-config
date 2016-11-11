package com.sample.conf;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.sample.filter.WindowsFilter;

@Configuration
@Conditional(WindowsCondition.class)
public class WindowsConfig {

  @Autowired
  private ResourceConfig config;

  @PostConstruct
  public void init() {
    config.register(WindowsFilter.class);
  }
}
