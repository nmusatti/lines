lines
=====

A simple REST service to discover segments within a set of points
-----------------------------------------------------------------

Lines is a simple REST service that showcases the detection of lines in a plane that include a 
minimum number of points. In this context a line is simply a set of two-dimensional points.

The simplest way to try lines out is to run it, either in your IDE or with the Maven command:

    mvn exec:java

and then direct your browser to:

    http://localhost:8080/swagger-ui/index.html
    
Lines is implemented in Java using Spring Boot 3.2.2 and requires Java 17 or above.
