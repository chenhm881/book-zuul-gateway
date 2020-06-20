package com.heiio.bookzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
@EnableDiscoveryClient
public class BookZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookZuulGatewayApplication.class, args);
    }

}
