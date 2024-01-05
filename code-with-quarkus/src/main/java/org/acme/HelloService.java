package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
@Path("/hello")

public class HelloService {

   @GET
    public String hello() {
        // Your current logic for returning a static string, update this to make a REST call
        return "Hello RESTEasy";
    }
}
