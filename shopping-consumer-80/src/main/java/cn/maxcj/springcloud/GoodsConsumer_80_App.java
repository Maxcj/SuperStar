package cn.maxcj.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GoodsConsumer_80_App {
    public static void main(String[] args) {
        SpringApplication.run(GoodsConsumer_80_App.class,args);
    }
}
