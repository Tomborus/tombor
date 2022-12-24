package resource;

import org.approximation.ApproximationService;
import org.kr.Sample;
import org.tr.cake.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tombor")
public class GreetingResource {

    @GET
    @Path("approximation/{numberOfIterations}")
    @Produces(MediaType.TEXT_PLAIN)
    public String draw(@PathParam("numberOfIterations") int numberOfIterations) {
        return ApproximationService.run(numberOfIterations);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("value") String value) {
        //value: rys; s; a
        return new Sample("^^").sampleValue(value);
    }

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        Strawberry strawberry = new Strawberry("red", "sweet", 25);
        Apple apple = new Apple("green", "sour", 5,1);
        IFruit banana = new Banana("yellow", "sweet", 3,32);
        Banana banana2 = new Banana("yellow", "sweet", 3,32);
        IFruit fruit = new Fruit();

        Cake bananaCake = new Cake(banana);
        Cake appleCake = new Cake(apple);
        Cake strawberryCake = new Cake(strawberry);

        return String.valueOf(banana.isOk());
    }
}
