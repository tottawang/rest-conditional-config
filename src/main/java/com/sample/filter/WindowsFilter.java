package com.sample.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import org.springframework.stereotype.Component;

@Component
public class WindowsFilter implements ContainerRequestFilter {

  public static final String HEADER = "X-Condition-Windows";

  /*
   * Set header based on different endpoint Condition annotation, this is just for testing purpose.
   */
  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    requestContext.getHeaders().add(HEADER, "Windows");
  }
}
