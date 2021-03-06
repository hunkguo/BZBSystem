package cn.hunk.controller;

import java.util.HashMap;

import cn.hunk.util.StringUtil;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import cn.hunk.model.User;
import cn.hunk.model.yuSuanJiChuShuJu;
import cn.hunk.dao.yuSuanJiChuShuJuMapper;
import cn.hunk.service.yuSuanJiChuShuJuService;
import cn.hunk.util.StaticString;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller  
@RequestMapping("/yusuanjichushuju")  
public class YuSuanController extends BaseController {
	@Autowired
	private yuSuanJiChuShuJuService yuSuanJiChuShuJuService;
	
	public static final String URL = "/yusuanjichushuju";
	static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}
	

	// 跳到登录页面
	@RequestMapping(value = "")
	public String index(Model model, HttpServletRequest request) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		String pgNum = request.getParameter("pageNum");// 跳转页
		String orderField = request.getParameter("orderField");// 排序字段
		String orderDirection = request.getParameter("orderDirection");// 排序方式
		int pageNum = 1;
		if (!StringUtil.isNullOrEmpty(pgNum)) {
			pageNum = Integer.parseInt(pgNum);
		}
		if (!StringUtil.isNullOrEmpty(orderField)) {
			map.put("orderField", orderField);
			request.setAttribute("orderField", orderField);
		}
		if (!StringUtil.isNullOrEmpty(orderDirection)) {
			map.put("orderDirection", orderDirection);
			request.setAttribute("orderDirection", orderDirection);
		}
		int totalCount = yuSuanJiChuShuJuService.queryCount(map);

		if (totalCount > 0) {
			map.put("start", (pageNum - 1) * 3);
			map.put("limit", 3);
			model.addAttribute("yusuanjichushujuList", yuSuanJiChuShuJuService.queryAll(map));
		}
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("totalCount",totalCount);
		
		return getViewPath("/index");
	}	
	

	// 添加数据
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		return getViewPath("/add");
	}	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("yusuanjichushuju") yuSuanJiChuShuJu yusuanjichushuju, Model model) {
		log.debug("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		log.debug(yusuanjichushuju.getName());
		log.debug(String.valueOf(yusuanjichushuju.getLvhejingeduan()));
		log.debug("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if (!yuSuanJiChuShuJuService.add(yusuanjichushuju)) {
			return ajaxForwardError("增加失败");
		}
		return ajaxForwardSuccess("增加成功!");
	}

}
