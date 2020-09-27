package com.lee.photo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class ExtendSwagger {

    @Value("${swagger.api-version}")     private String version;

    @Bean
    public Docket userDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("User")
                .select()
                .paths(PathSelectors.regex("/user/*"))
                .build()
                .apiInfo(new ApiInfo("Api With User",
                "操作用户的相关接口",
                version,
                "urn:tos",
                new Contact("Lee", null, "8476235@qq.com"),
                null,
                null));
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Role").apiInfo(new ApiInfo("Api With Role",
                "操作角色的相关接口",
                version,
                "urn:tos",
                new Contact("Lee", null, "8476235@qq.com"),
                null,
                null));
    }

}
