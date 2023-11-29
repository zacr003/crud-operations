package com.teamsparq.crudoperations.repository;

import com.teamsparq.crudoperations.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
