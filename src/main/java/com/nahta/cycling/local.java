//This is if the user wants to import a local file. We start with the Garmin tcx format.


// these import statements come from https://camel.apache.org/camel-spring-boot/latest/
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class local extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // this obviously needs to not be a local folder eventually
        // this is just a test to see if Camel works at all with the current import (no idea what I am doing)
        from("file:/Users/dougwhitfield/Downloads/Personal?recursive=true&include=*.tcx").to("file:/Users/dougwhitfield/Downloads?recursive=true&include=*.tcx");
    }
}