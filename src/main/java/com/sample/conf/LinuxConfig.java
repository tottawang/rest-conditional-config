package com.sample.conf;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.sample.filter.LinuxFilter;

@Configuration
@Conditional(LinuxCondition.class)
public class LinuxConfig {

  @Autowired
  private ResourceConfig config;

  @PostConstruct
  public void init() {
    config.register(LinuxFilter.class);
  }
}
