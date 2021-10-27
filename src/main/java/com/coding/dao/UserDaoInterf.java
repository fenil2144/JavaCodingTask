package com.coding.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.model.DAOUser;


/**
 * Interface to interact with JPA Data Repository
 * @author Fenil
 *
 */
@Repository
public interface UserDaoInterf extends CrudRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}