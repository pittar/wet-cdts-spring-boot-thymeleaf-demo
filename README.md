# WET CDTS Spring Boot Demo

## Objective

This is a small demo app to show the integration of the WET Centrally Deploy Templates Solution (CDTS) with Spring Boot and Thymeleaf.

The objective is to make a plain vanilla Spring Boot app that incorporates the Thymeleaf variant of the CDTS templates.  This can be used as an example application of how to use this starter.

## Spring Boot Starter

The code for the wet-cdts-spring-boot-thymeleaf-starter [can be found here](https://github.com/wet-boew/spring-boot-thymeleaf).  In order to use this starter in your application, you will need to clone that repository and run `mvn install`.

## Running the Demo App

Once you have cloned and installed `wet-cdts-spring-boot-thymeleaf-starter`, clone this repository and run `mvn install` on it.  If you are using Eclipse, you can right-click on `ApplicationConfig.java` and select `Run As -> Java Application`.

One the app finishes starting, access the app at [http://localhost:8080/home](http://localhost:8080/home).

## Future Plans

1. Publish the [wet-cdts-spring-boot-thymeleaf-starter](https://github.com/wet-boew/spring-boot-thymeleaf) to [Maven Central](http://search.maven.org/) so people won't have to compile the cod themselves.
2. Show how all aspects of the library work with working examples.
3. Make the demo app available as a Docker image for quick demos.