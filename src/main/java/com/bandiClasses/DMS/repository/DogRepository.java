package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/** 
 * @author Shivaram Reddy Palla
 */

public interface DogRepository extends CrudRepository<Dog,Integer>{

	List<Dog> findByName(String name);
}
