package cn.hunk.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.hunk.model.User;
import cn.hunk.model.yuSuanJiChuShuJu;

@Service
public interface yuSuanJiChuShuJuService {
	int queryCount(HashMap<String,Object> map);
	List<yuSuanJiChuShuJu> queryAll(HashMap<String,Object> map);
	boolean add(yuSuanJiChuShuJu yusuanjichushuju);
}
