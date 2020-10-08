package com.dxc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.model.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {

}
