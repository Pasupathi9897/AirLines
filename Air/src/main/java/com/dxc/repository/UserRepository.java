package com.dxc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
