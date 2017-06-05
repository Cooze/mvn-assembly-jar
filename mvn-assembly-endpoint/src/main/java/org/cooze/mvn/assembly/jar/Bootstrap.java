package org.cooze.mvn.assembly.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cooze
 * @version 1.0.0
 * @desc tomcat容器运行springboot程序
 * @date 2017/6/3
 */
@SpringBootApplication
@ComponentScan
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class,args);
    }

}
