package com.Project1.blog;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Project1.blog.config.AppConstants;
import com.Project1.blog.entites.Role;
import com.Project1.blog.repositories.RoleRepo;


@SpringBootApplication

public class BlogAppApis2Application implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passencoder;
	@Autowired
	private RoleRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApis2Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passencoder.encode("abc"));
		try {
			Role role=new Role();
			role.setId(AppConstants.ADMIN_USER);
			role.setName("ROLE_ADMIN");
			
			Role role1=new Role();
			role1.setId(AppConstants.NORMAL_USER);
			role1.setName("ROLE_NORMAL");
			List<Role> roles = List.of(role,role1);
			
			List<Role> result = this.repo.saveAll(roles);
			
			result.forEach(r->{
				System.out.println(r.getName());
			});
			
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
