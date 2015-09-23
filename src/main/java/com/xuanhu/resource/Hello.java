package com.xuanhu.resource;

import com.google.gson.Gson;
import com.xuanhu.dto.People;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by zsk on 9/23/15.
 */
@Path("hello")
public class Hello {

    @GET
    @Path("/zsk")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        People p = new People();
        p.setName("zsk");
        p.setGender("man");
        p.setAge(21);

        return new Gson().toJson(p);
    }
}
