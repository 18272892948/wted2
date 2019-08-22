package com.blockbus.wted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author blockbus
 *@Date Created in 2019/3/13 09:57
 */
@Configuration
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("API").
                description("").
                contact(new Contact("1","地址","121212@163.com")).build();
    }
    @Bean  //等价于 <bean>标签
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.blockbus.wted.core.user.controller")).build();
    }


   /* return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
            .pathMapping("/")
				.select() // 选择那些路径和api会生成document
				.apis(RequestHandlerSelectors.any())// 对所有api进行监控
            .apis(RequestHandlerSelectors.basePackage("com.test.map_bi.controller"))
            .build();
*/

}
