package com.connection.mobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connection.mobileconnect.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
