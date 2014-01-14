package com.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
//import com.hunk.dao.XiangmuMapper;  
//import com.hunk.model.*; 


@Controller  
@RequestMapping("/demo")  
public class IndexController extends BaseController{
	public static final String URL = "/demo/";
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}
	
  //@Autowired  
  //private XiangmuMapper xiangmuDao;  
    
  @RequestMapping  
  public String index(ModelMap model) {  
	 // Xiangmu Xiangmu = xiangmuDao.selectByPrimaryKey(1);  

      //model.addAttribute("Xiangmu", Xiangmu);  
      model.addAttribute("hello", "hello spring mvc");  
      return getViewPath("list");
  }    

}
