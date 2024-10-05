package com.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
