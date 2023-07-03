package com.kanishk.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanishk.demo.entites.User;

@SpringBootApplication
public class MyWebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(MyWebAppApplication.class, args);
		UserRepo userRepository = context.getBean(UserRepo.class);
		User user1 = new User();
		user1.setName("Kanishk");
		user1.setCity("Ranchi");
		user1.setStatus("married");
		
		User user2 = new User();
		user2.setName("Pankaj");
		user2.setCity("Delhi");
		user2.setStatus("single");
		
		User user3 = new User();
		user3.setName("Avinash");
		user3.setCity("Pune");
		user3.setStatus("divorced");
		
		List<User> users = List.of(user1,user2,user3);
		
	    Iterable<User> res = userRepository.saveAll(users);
	    
	    res.forEach(user ->{
	    	System.out.println(user);
	    });
	    
	    //Update the user data
	    
	    Optional<User> optional = userRepository.findById(1);
	    
	    User get = optional.get();
	    
	    get.setName("Ankit");
	    
	    User result = userRepository.save(get);
	    
	    System.out.println(result);
	    
	    // deleting the user from the database
	    
	    userRepository.deleteById(52);
	    
	    System.out.println("User Deleted");
	    
	    
	    

	    
	    
		
	}

}
