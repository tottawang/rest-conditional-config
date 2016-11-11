package com.sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.sample.filter.LinuxFilter;
import com.sample.filter.WindowsFilter;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RestResource {

  @GET
  @Path("condition")
  public String getCondition(@HeaderParam(LinuxFilter.HEADER) String header,
      @HeaderParam(WindowsFilter.HEADER) String header1) {
    return "[Linux Condition Header]: " + header + " [Widnows Condition Header]: " + header1;
  }
}
