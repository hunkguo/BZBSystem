package cn.hunk.dao;

import cn.hunk.model.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    
    User loadUser(String username);
    
    List<User> selectAllUser();
    
    int deleteByPrimaryKey(int id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
	int queryUserCount(HashMap<String,Object> map);
	List<User> queryUser(HashMap<String,Object> map);
	int del(User user);
	int edit(User user);
}