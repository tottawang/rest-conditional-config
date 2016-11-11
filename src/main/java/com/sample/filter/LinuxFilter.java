package com.sample.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class LinuxFilter implements ContainerRequestFilter {

  public static final String HEADER = "X-Condition-Linux";

  /*
   * Set header based on different endpoint Condition annotation, this is just for testing purpose.
   */
  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    requestContext.getHeaders().add(HEADER, "Linux");
  }
}
