package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

public static void main(String[] args) {
try (AnnotationConfigApplicationContext context = new
AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
HelloWorldService helloWorldService = context.getBean(HelloWorldService.class); helloWorldService.sayhello();
}
}

}
