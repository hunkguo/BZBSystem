package cn.hunk.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.hunk.model.User;

@Service
public interface UserService {	
	User loadUser(String username);
	List<User> selectAllUser();
	boolean add(User user);
	int queryUserCount(HashMap<String,Object> map);
	List<User> queryUser(HashMap<String,Object> map);
	boolean del(User user);
	boolean edit(User user);
	User loadUser(int id);
}
