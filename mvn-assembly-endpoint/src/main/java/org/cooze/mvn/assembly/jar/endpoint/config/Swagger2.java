package org.cooze.mvn.assembly.jar.endpoint.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author cooze
 * @version 1.0.0
 * @desc 生成API文档
 * @date 2017/6/3
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    private static final String basePackage = "org.cooze.mvn.assembly.jar.endpoint.api";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("assembly RESTful APIs")
                .description("assembly RESTful APIs")
                .termsOfServiceUrl("https://github.com/Cooze")
                .version("2.0.0")
                .build();
    }
}

