package com.sample.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.sample.filter.LinuxFilter;

@Configuration
@Conditional(LinuxCondition.class)
public class LinuxConfig extends ResourceConfig {

  public LinuxConfig() {
    register(LinuxFilter.class);
  }

}
