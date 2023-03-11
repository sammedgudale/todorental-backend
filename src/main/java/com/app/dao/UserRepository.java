package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Role;
import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("select  u from User u where u.email=:em and u.password=:pass")
    Optional<User> Login(@Param("em") String email,@Param("pass") String password);	 

@Query ("Select u.contact_number from User u where u.id=:ownerid")
   String getUserDetails(@Param("ownerid") Long id);

 @Query("select u from User u where u.id=:id and u.role=:role")
   User profilePage(@Param("id") Long id,@Param("role") Role role);
 
 @Query("select u.email from User u where u.email=:email")
    String existsByEmail(@Param ("email") String email);
 
 @Query("select u from User u where u.email=:email")
 User findByEmail(@Param ("email") String email);  
}
