## JAX-WS (JSR 224)

Java API for XML Web Services (JAX-WS) is a technology for building web services and clients that communicate using XML.
JAX-WS allows developers to write message-oriented as well as Remote Procedure Call-oriented (RPC-oriented) web services.

From: https://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html

### This project
This repository contais two projects, jaxws which contains Publisher and jaxwsclient which contains Consumer.
jaxwsclient also have a plugin to generate classes from Publisher.

Run Plublisher.main() to start the server...
Then you can run Consumer.main() to get results from the server...
and if you run `mvn install` in jaxwsclient you will get the generated classes.

### Runner classes

Publisher (jaxws)
Consumer (jaxwsclient)

Endpoints from server:
http://localhost:8080/numbers
http://localhost:8080/numbers?wsdl

### Generated classes for WSDL - "WsImport" via plugin maven
Plugin jaxws-maven-plugin in pom.xml (jaxws) line 52

(jaxwsclient) - Generated in ...jaxwsexample\jaxwsclient\target\generated-sources\wsimport
(jaxwsclient) - copied to ...jaxwsexample/jaxwsclient/src/main/java/com/toniclecb/jaxwsclient/generated

In the generated classes we need change package and add a namespace.

### Dependencies (jaxws and jaxwsclient)


```
<!-- Dependencies to run jax-ws in Java 11 (jaxws) -->
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>2.3.3</version>
    <type>pom</type>
</dependency>
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>rt</artifactId>
    <version>2.3.3</version>
</dependency>
```

### Another things

Dependency JUnit and one test case in jaxwsclient.
