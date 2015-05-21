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
@PATH

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


