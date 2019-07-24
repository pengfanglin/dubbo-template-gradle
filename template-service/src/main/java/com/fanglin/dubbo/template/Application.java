package com.fanglin.dubbo.template;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.container.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启用程序
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:21
 **/
@SpringBootApplication(scanBasePackages = "com.fanglin")
@MapperScan("com.fanglin.dubbo.template.mapper")
@EnableDubbo
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        Main.main(null);
    }
}
