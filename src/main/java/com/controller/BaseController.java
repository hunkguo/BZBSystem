package com.controller;


import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public abstract class BaseController implements ServletContextAware{
	
	public static final String RELOAD = "redirect:";// RELOAD + URL
	public static final String FORWARD = "forward:";// RELOAD + URL
	
	protected ServletContext servletContext;
	
	public String getContextPath(){
		return servletContext.getContextPath();
	}
	
	public void setServletContext(ServletContext servletContext) {
		 this.servletContext = servletContext;
		
	}
	
	/**
	 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎªÊý×Ö
	 * @param num
	 * @return
	 */
	protected Boolean isNumber(String num){
		try {  
            Integer.valueOf(num);//°Ñ×Ö·û´®Ç¿ÖÆ×ª»»ÎªÊý×Ö  
            return true;//Èç¹ûÊÇÊý×Ö£¬·µ»ØTrue  
        } catch (Exception e) {  
            return false;//Èç¹ûÅ×³öÒì³££¬·µ»ØFalse  
        }  
	}
	
	/**
	 * ´«ÈëÏà¶ÔÂ·¾¶£¬»ñÈ¡½á¹û¾ø¶ÔÂ·¾¶
	 * @param path
	 * @return
	 */
	protected abstract String getViewPath(String path);
	protected String reload(String path) {
		return RELOAD + path;
	}
	protected String forward(String path) {
		return FORWARD + path;
	}
}
