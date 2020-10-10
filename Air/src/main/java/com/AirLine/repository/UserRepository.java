package com.AirLine.repository;

import org.springframework.data.repository.CrudRepository;

import com.AirLine.model.User;

public interface UserRepository extends CrudRepository<User, String> {


}
