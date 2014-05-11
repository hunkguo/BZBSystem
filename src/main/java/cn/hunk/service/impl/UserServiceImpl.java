package cn.hunk.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hunk.dao.UserMapper;
import cn.hunk.model.User;
import cn.hunk.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	/**
	 * 得到一个用户
	 * @param user
	 * @return
	 */
	public User loadUser(String username){
		return userMapper.loadUser(username);
	}
	public User loadUser(int id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}
	public boolean add(User user){
		if(userMapper.insert(user) == 1)return true;
		return false;
	}
	public int queryUserCount(HashMap<String,Object> map){
		return userMapper.queryUserCount(map);
	}
	public List<User> queryUser(HashMap<String,Object> map){
		return userMapper.queryUser(map);
	}
	public boolean del(User user){
		if(userMapper.deleteByPrimaryKey(user.getId()) == 1)return true;
		return false;
	}
	
	/**
	 * 编辑一个用户
	 * @param user
	 * @return
	 */
	public boolean edit(User user){
		if(userMapper.edit(user) == 1)return true;
		return false;
	}
	
	
}
