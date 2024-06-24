package net.xuanyuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.xuanyuy.mapper")
public class xuanyuApplication {

    public static void main(String[] args) {
        SpringApplication.run(xuanyuApplication.class, args);
    }

}
