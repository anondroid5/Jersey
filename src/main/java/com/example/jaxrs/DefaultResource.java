package com.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/")
public class DefaultResource {

    @GET
    public String sample() {
        return "Default Resource";
    }
    
    @Path("/mvc")
    @GET
    public Viewable get(){
        return new Viewable("/hello-mvc");
    }

    @Path("/mvc2")
    @GET
    public Viewable test(){
        return new Viewable("/hello-mvc2");
    }
}