package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("select  u from User u where u.email=:em and u.password=:pass")
    Optional<User> Login(@Param("em") String email,@Param("pass") String password);
}
