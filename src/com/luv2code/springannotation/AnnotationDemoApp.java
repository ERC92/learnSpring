package com.luv2code.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach badCoach = context.getBean("badMint", Coach.class);
		Coach hockCoach = context.getBean("hockeyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("##########");
		System.out.println(badCoach.getDailyWorkout());
		System.out.println(badCoach.getDailyFortune());
		System.out.println("##########");
		System.out.println(hockCoach.getDailyWorkout());
		System.out.println(hockCoach.getDailyFortune());
		
		context.close();
		
	}

}
