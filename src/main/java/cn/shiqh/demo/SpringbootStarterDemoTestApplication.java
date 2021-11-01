package cn.shiqh.demo;

import cn.shiqh.springboot.starter.EnableDemoConfiguration;
import cn.shiqh.springboot.starter.bean.StartDemoSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableDemoConfiguration
public class SpringbootStarterDemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterDemoTestApplication.class, args);
    }

    @Autowired
    private StartDemoSource startDemoSource;

    @PostConstruct
    private void print() {
        System.out.println(startDemoSource.test());
    }
}
