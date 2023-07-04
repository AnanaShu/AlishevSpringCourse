package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //этот класс обращается к файлу applicationContext.xml, считывает его и помещает все бины,
        //которые там описаны в ApplicationContext

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }


}
