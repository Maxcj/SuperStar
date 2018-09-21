package cn.maxcj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class UserProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(UserProvider8001_App.class,args);
    }

}
