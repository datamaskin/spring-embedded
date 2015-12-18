package name.davidwbrown.dao;

import name.davidwbrown.model.User;

import java.util.List;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}