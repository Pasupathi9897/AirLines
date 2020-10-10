package com.AirLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.AirLine.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {


}
