package com.AirLine.service;

import java.util.List;

public interface AdminSecurityService<E>{
	boolean save(E e);
	E find(String id);
	List<E> findAll();
	boolean update(E e);
	boolean delete(String id);
}