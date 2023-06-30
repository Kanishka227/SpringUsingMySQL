package com.kanishk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanishk.demo.entites.User;

@SpringBootApplication
public class MyWebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(MyWebAppApplication.class, args);
		UserRepo userRepository = context.getBean(UserRepo.class);
		User user = new User();
		user.setName("Kanishk");
		user.setCity("Ranchi");
		user.setStatus("married");
		
		User user2 = new User();
		user2.setName("Pankaj");
		user2.setCity("Delhi");
		user2.setStatus("single");
		
		User user3 = new User();
		user3.setName("Avinash");
		user3.setCity("Pune");
		user3.setStatus("divorced");
		
	    User u1 = userRepository.save(user);
	    User u2 = userRepository.save(user2);
	    User u3 = userRepository.save(user3);
	    
	    System.out.println(u1 +"\n"+u2+"\n"+u3);
	    
	    
		
	}

}
