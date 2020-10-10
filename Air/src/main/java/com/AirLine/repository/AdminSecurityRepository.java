package com.AirLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirLine.model.AdminSecurity;

public interface AdminSecurityRepository extends JpaRepository<AdminSecurity, String> {

}
