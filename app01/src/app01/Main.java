package app01;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app01.bean.Employee;
import app01.bean.Product;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        MovieStar movieStar1 = context.getBean("movieStar", MovieStar.class);
        movieStar1.setName("李连杰");
        System.out.println("movieStar1: " + movieStar1.getName());
        
        Product movieStar2 = context.getBean("movieStar", MovieStar.class);
        System.out.println("movieStar2: " + movieStar2.getName());
        
        Product featuredMovieStar = context.getBean("featuredMovieStar", MovieStar.class);
        System.out.println(featuredProduct.getName() + ", " + featuredProduct.getDescription());
        
        Calendar calendar = context.getBean("calendar", java.util.Calendar.class);
        System.out.println(calendar.getTime());
        
        
        Employee student1 = context.getBean("student1", Student.class);
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());

        Employee student2 = context.getBean("student2", Student.class);
        System.out.println(student2.getName());
        System.out.println(student2.getAddress());

    }

}
