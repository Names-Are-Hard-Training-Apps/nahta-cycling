package com.nahta.cycling;

import java.io.FileReader;
import java.io.BufferedReader;

//This is if the user wants to import a local file. We start with the Garmin tcx format.


// these import statements come from https://camel.apache.org/camel-spring-boot/latest/
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class local extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // this obviously needs to not be a local folder eventually
        // this code works, but is not very useful.
        from("file:/Users/dougwhitfield/Downloads/Personal?recursive=true&include=1590839323-90 min Power Zone Endurance Ride with Matt Wilpers-18f8eff79957451a8079d3cd2527db07.tcx").to("file:output?fileName=/Users/dougwhitfield/Downloads");
    
/*The file is not getting output in the two statement, so we aren't able to read it.
          try (BufferedReader br = new BufferedReader(new FileReader("/Users/dougwhitfield/Downloads/90_min_Power_Zone_Endurance_Ride_with_Matt_Wilpers.tcx"))) {
 
     	   String line;
     	   while ((line = br.readLine()) != null) {
     	       System.out.println(line);
    
    
    	   } */
    	}
}