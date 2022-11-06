package org.tr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "kaktus";
    }

    @GET
    @Path("pomello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloPomello() {
        int number = new Random().nextInt(5) + 1;
        return switchTest(number);
    }

    private String switchTest(int number) { // autocontrol ctr+alt +l/o
        switch (number) {
            case 1:
                return "dupa";
            case 2:
                return "kuktas";
            case 3:
                return "nos";
        }
        return "cokolwiek";
    }
}
