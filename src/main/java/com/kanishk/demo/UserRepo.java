package com.kanishk.demo;

import org.springframework.data.repository.CrudRepository;

import com.kanishk.demo.entites.User;

public interface UserRepo extends CrudRepository<User,Integer>{

	
}
