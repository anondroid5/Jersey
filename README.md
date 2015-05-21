# Jersey
RESTful Web Services framework

#Environment
Java8 (jdk1.8.0_05)

Apache Maven 3.0.2

Apache Tomcat 7.0

http://mvnrepository.com/

#Details
This root is localhost:8080/Jersey/

Restful Resources is available When you access localhost:8080/Jersey/api/

Restful Resources can be changed by utilizing web.xml

###Annotation
####@PATH

The @Path annotation's value is a relative URI path. In the example above, the Java class will be hosted at the URI path /helloworld. This is an extremely simple use of the @Path annotation. What makes JAX-RS so useful is that you can embed variables in the URIs.

URI path templates are URIs with variables embedded within the URI syntax. These variables are substituted at runtime in order for a resource to respond to a request based on the substituted URI. Variables are denoted by curly braces. For example, look at the following @Path annotation:

@Path("/users/{username}")
In this type of example, a user will be prompted to enter their name, and then a Jersey web service configured to respond to requests to this URI path template will respond. For example, if the user entered their username as "Galileo", the web service will respond to the following URL: http://example.com/users/Galileo

To obtain the value of the username variable the @PathParam may be used on method parameter of a request method, for example:

Example 3.2. Specifying URI path parameter
```java
@Path("/users/{username}")
public class UserResource {
 
    @GET
    @Produces("text/xml")
    public String getUser(@PathParam("username") String userName) {
        ...
    }
}
```

####@GET,@PUT,@POST,@DELETE and @HEAD (HTTP Methods)

@GET, @PUT, @POST, @DELETE and @HEAD are resource method designator annotations defined by JAX-RS and which correspond to the similarly named HTTP methods. In the example above, the annotated Java method will process HTTP GET requests. The behavior of a resource is determined by which of the HTTP methods the resource is responding to

The following example is an extract from the storage service sample that shows the use of the PUT method to create or update a storage container:

Example 3.3. PUT method
```java
@PUT
public Response putContainer() {
    System.out.println("PUT CONTAINER " + container);
 
    URI uri = uriInfo.getAbsolutePath();
    Container c = new Container(container, uri.toString());
 
    Response r;
    if (!MemoryStore.MS.hasContainer(c)) {
        r = Response.created(uri).build();
    } else {
        r = Response.noContent().build();
    }
 
    MemoryStore.MS.createContainer(c);
    return r;
}
```



#Author
Fumihiko Akagi

#Copyright
  
    The MIT License

    Copyright (c) 2013 Fumihiko Akagi

    Permission is hereby granted, free of charge, to any person obtaining a copy of this
    software and associateddocumentation files (the "Software"), to deal in the Software
    without restriction, including without limitationthe rights to use, copy, modify, merge,
    publish, distribute,sublicense, and/or sell copies of the Software,and to permit persons
    to whom the Software is furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all copies or 
    substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
    INCLUDING BUT NOT LIMITED TO THE   WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
    PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE A UTHORS OR COPYRIGHT
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
    CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
    OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


