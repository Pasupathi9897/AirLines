package com.AirLine.repository;

import org.springframework.data.repository.CrudRepository;

import com.AirLine.model.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, String> {

}
