package com.sample.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.sample.filter.LinuxFilter;
import com.sample.filter.WindowsFilter;

@Configuration
public class ApplicationConfig extends ResourceConfig {

  public ApplicationConfig() {
    packages("com.sample.resources");
    register(LinuxFilter.class);
    register(WindowsFilter.class);
  }
}
