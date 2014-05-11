package cn.hunk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RequestMethod; 

import cn.hunk.util.StaticString;
  
//import com.hunk.dao.XiangmuMapper;  
//import com.hunk.model.*; 



@Controller  
@RequestMapping("")  
public class IndexController extends BaseController{
	public static final String URL = "";
	static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		if(request.getSession().getAttribute(StaticString.LOGIN_USER)!=null){  
            return getViewPath("/index");  
        }  
		else
		{
			return "redirect:/user/login";
		}
	}	
	

}
