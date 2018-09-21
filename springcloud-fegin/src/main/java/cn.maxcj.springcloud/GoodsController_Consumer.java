package cn.maxcj.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.maxcj.springcloud"})
@ComponentScan("cn.maxcj.springcloud")
public class GoodsController_Consumer {
    public static void main(String[] args) {
        SpringApplication.run(GoodsController_Consumer.class, args);
    }
}
