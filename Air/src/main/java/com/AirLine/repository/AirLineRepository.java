package com.AirLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirLine.model.AirLine;


public interface AirLineRepository extends JpaRepository<AirLine, Long> {

}
