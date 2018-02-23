package com.tingfeng.swagger2demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//访问显示http://localhost:8081/swagger/swagger-ui.html
//如果显示异常，可能是资源文件的路径显示问题，参考http://blog.csdn.net/pispower/article/details/77896344
@ComponentScan(basePackages= {"com.tingfeng"})
@SpringBootApplication
public class Swagger2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2DemoApplication.class, args);
	}
}
