package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; @Configuration
public class HelloWorldConfig { @Bean
public HelloWorldService helloWorldService() {
return new HelloWorldService();
}
}

