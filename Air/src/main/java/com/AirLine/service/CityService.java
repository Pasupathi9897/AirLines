package com.AirLine.service;

import java.util.List;

public interface CityService<E>{
	boolean save(E e);
	E find(String city);
	List<E> findAll();
	boolean update(E e);
	boolean delete(String city);
}