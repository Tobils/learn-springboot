# Spring Core Fundamentals Exercise

--
## Details
**1. Overview**

    Dependency Injection is one of those important topics that we should really have a handle on before we move forward. In this exercise we are going to create an application from scratch and test out our DI skills. We also need the ability to access values in our components so lets have some fun testing that out as well.

**2. Exercise**

    Create a new web application
    Create some configuration values in both a properties/YAML configuration file.
    Create the following packages under your main package
        controller
        service
    Create a Home Controller (in the controller package) with as many methods as you like
    In one of those methods print out a value from one of your configuration files to the screen.
    Create a new service in the services package (don't forget to use the @Service annotation)
    Create a method in the service class that returns a string message
    Use @Autowired to inject an instance of the service class
        play around with property / setter / constructor based injection
    Call the service method from a controller method and print out the message that was returned from the service