package cn.hunk.service.impl;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hunk.model.User;
import cn.hunk.model.yuSuanJiChuShuJu;
import cn.hunk.service.yuSuanJiChuShuJuService;
import cn.hunk.dao.yuSuanJiChuShuJuMapper;

@Service
public class yuSuanjiChuShuJuServiceImpl implements yuSuanJiChuShuJuService{
	@Autowired
	private yuSuanJiChuShuJuMapper yuSuanJiChuShuJuMapper;
	public int queryCount(HashMap<String,Object> map){
		return yuSuanJiChuShuJuMapper.queryCount(map);
	}
	public List<yuSuanJiChuShuJu> queryAll(HashMap<String,Object> map) {
		
		return yuSuanJiChuShuJuMapper.queryAll(map);
	}
	public boolean add(yuSuanJiChuShuJu yusuanjichushuju){
		if(yuSuanJiChuShuJuMapper.insertSelective(yusuanjichushuju) == 1)return true;
		return false;
	}

}
