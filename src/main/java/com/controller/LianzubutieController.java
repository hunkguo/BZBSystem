package com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;
  




import com.dao.*;
import com.model.*; 

@Controller  
@RequestMapping("")  
public class LianzubutieController extends BaseController{
	public static final String URL = "lianzubutie/";
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}
	
  @Autowired  
  private xingzhengquyuMapper xingzhengquyuDao;  
  @Autowired  
  private jibenxinxiMapper jibenxinxiDao;  
    
  @RequestMapping  
  public String index(ModelMap model) {  
	  List<xingzhengquyu> xzqy =xingzhengquyuDao.selectAll();
      
	  /*
      for (int i = 0; i < xzqy.size(); i++) {
    	    System.out.println(xzqy.get(i));
    	}
      
      */
      model.addAttribute("xzqy", xzqy);    
      return getViewPath("create");
  }
  

  @RequestMapping("/insert")  
  public String insert(jibenxinxi jbxx,ModelMap model) 
  
  {  
	  List<xingzhengquyu> xzqy =xingzhengquyuDao.selectAll();
	  
	  System.out.println(jbxx.getXingming());
	  System.out.println(jbxx.getShenfenzheng());
	  
	  //jbxx.setId(1);
	  //jbxx.setXingming("xingming");
	  
	  jibenxinxiDao.insert(jbxx);
	  /*
      for (int i = 0; i < xzqy.size(); i++) {
    	    System.out.println(xzqy.get(i));
    	}
      
      */
      model.addAttribute("xzqy", xzqy);    
      return getViewPath("create");
  }    
  

}

