package springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) 
	{
	
		// On install le xml spring
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrive bean from spring container
		
		CoachInterface theCoach = context.getBean("myCoach", CoachInterface.class);
		
	
		// Appeler les méthodes
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Appeler les méthodes après injection
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
