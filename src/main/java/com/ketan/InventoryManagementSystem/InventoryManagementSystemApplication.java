package com.ketan.InventoryManagementSystem;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ketan.InventoryManagementSystem.entities.Role;
import com.ketan.InventoryManagementSystem.repository.RoleRepo;

@SpringBootApplication
public class InventoryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(/* RoleRepo roleRepo */) {
		return args->{
			//Added some other role
			
//			Role admin = new Role("admin", "You Have Full Access of System", new Date(), new Date() );
//			roleRepo.save(admin);
//			Role user = new Role("user", "You Have Limited Access of system", new Date(), new Date() );
//			roleRepo.save(user);
//			System.out.println("Employee and normal user role added");
//			
//			System.out.println("Number of Users");
//			System.out.println(roleRepo.count());
//			
//			System.out.println("Selected all roles");
//			List<Role> roles = roleRepo.findAll();
//			System.out.println(roles);
//			System.out.println(roleRepo.findRoleByRole("admin"));
			
		};
	}

}
