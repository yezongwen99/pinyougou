package pers.yezi.shop.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"pers.yezi.shop.web.dao"})
public class PinyougouShopWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouShopWebApplication.class, args);
    }

}
