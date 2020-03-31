package me.yonkum.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository != null); // 의존성 주입이 되어 있는 것
        //일일히 빈으로 등록하는 것이 굉장히 번거롭다 -> 그래서 등장한 것이
        //SpringApplication.run(DemoApplication.class, args);
    }
}
