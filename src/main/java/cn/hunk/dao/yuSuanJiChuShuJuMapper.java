package cn.hunk.dao;

import java.util.HashMap;
import java.util.List;

import cn.hunk.model.User;
import cn.hunk.model.yuSuanJiChuShuJu;

public interface yuSuanJiChuShuJuMapper {
    List<yuSuanJiChuShuJu> queryAll(HashMap<String,Object> map);
	int queryCount(HashMap<String,Object> map);

    int insert(yuSuanJiChuShuJu record);

    int insertSelective(yuSuanJiChuShuJu record);
}