package com.sample.filter;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.sample.conf.LinuxCondition;

@Component
@Conditional(LinuxCondition.class)
public class LinuxFilter implements ContainerRequestFilter {

  public static final String HEADER = "X-Condition-Linux";

  @Autowired
  private ResourceConfig config;

  @PostConstruct
  public void init() {
    config.register(LinuxFilter.class);
  }

  /*
   * Set header based on different endpoint Condition annotation, this is just for testing purpose.
   */
  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    requestContext.getHeaders().add(HEADER, "Linux");
  }
}
