## JAX-WS (JSR 224)

Java API for XML Web Services (JAX-WS) is a technology for building web services and clients that communicate using XML.
JAX-WS allows developers to write message-oriented as well as Remote Procedure Call-oriented (RPC-oriented) web services.

From: https://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html

### This project
This repository contais two projects, jaxws which contains Publisher and jaxwsclient which contains Consumer.

### Runner classes

Publisher (jaxws)
Consumer (jaxwsclient)

Endpoints from server:
http://localhost:8080/numbers
http://localhost:8080/numbers?wsdl

### Generated classes for WSDL - "WsImport" via plugin maven
Plugin jaxws-maven-plugin in pom.xml (jaxws) line 52

(jaxws) - Generated in ...\jaxws\target\generated-sources\wsimport\com\toniclecb\jaxws\server
(jaxwsclient) - copied to .../jaxwsclient/src/main/java/com/toniclecb/jaxwsclient/generated

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

