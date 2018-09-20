package com.niit.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *使用@SpringBootAppication注解的类，是启动主类，一般放在项目顶层包下
 * 它是以下内容的综合：
 * 1.@Configuration 标记一个类来作为bean定义的应用程序上下文的资源
 * 2.@EnableAutofiguration：告诉Spring Boot开始加载基于类路径下的配置星系。beans，各种属性配置
 * 3.@ComponentScan告诉spring寻找其他组建，配置，以及业务层类，最前面才能加载到所有的类
 *
 */
@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
//		//启动spring boot，并得到上下文对象
//		ApplicationContext ac=SpringApplication.run(QuickstartApplication.class, args);
//		System.out.println("使用spring boot开始注入hello的bean：");
////		//从容器中获取hello的对象hello
////		Hello hello=(Hello) ac.getBean("hello");
////		System.out.println(hello.getHello());
//		Course course=(Course) ac.getBean("course");
//		System.out.println(course.toString());

    SpringApplication.run(QuickstartApplication.class,args);
	}
}
