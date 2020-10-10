package com.AirLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirLine.model.City;


public interface CityRepository extends JpaRepository<City, String> {

}

