package com.x.redis.dao;

import com.x.redis.pojo.User;

public interface UserDAO {
	 public void saveUser(User user);
     public User getUser(final String id);
}
