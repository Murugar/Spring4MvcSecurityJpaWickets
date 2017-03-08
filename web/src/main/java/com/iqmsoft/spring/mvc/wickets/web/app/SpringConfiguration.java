package com.iqmsoft.spring.mvc.wickets.web.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
@Lazy
@ComponentScan(basePackages = "com.iqmsoft")
public class SpringConfiguration {

}