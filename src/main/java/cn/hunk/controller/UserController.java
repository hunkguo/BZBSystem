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
import cn.hunk.dao.UserMapper;
import cn.hunk.service.UserService;
import cn.hunk.util.StaticString;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller  
@RequestMapping("/user")  
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	public static final String URL = "/user";
	static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}


	  
		// 跳到登录页面
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String login() {
			return getViewPath("/login");
		}	
		

		// 登录
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String login(@ModelAttribute("user") User user, Model model,HttpServletRequest request) {
			if (user != null) {
				User u = new User();
				u.setName(user.getName());
				log.debug("222"+user.getPassword());
				log.debug("333"+user.getUsername());
				log.debug("444"+user.getId());
				u = userService.loadUser(user.getUsername());// 根据用户名查询用户
				log.debug("222"+u.getUsername());
				if (u != null && u.getPassword().equals(user.getPassword())) {
					request.getSession().setAttribute(StaticString.LOGIN_USER, u);// 将登录用户信息保存至session中
					return "redirect:/";
				}
			}
			model.addAttribute("loginMsg", "用户名或密码错误");
			return getViewPath("/login");
		}
		

		// 跳到登录页面
		@RequestMapping(value = "")
		public String index(Model model, HttpServletRequest request) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			String username = request.getParameter("username");// 用户名称
			String pgNum = request.getParameter("pageNum");// 跳转页
			String orderField = request.getParameter("orderField");// 排序字段
			String orderDirection = request.getParameter("orderDirection");// 排序方式
			int pageNum = 1;
			if (!StringUtil.isNullOrEmpty(pgNum)) {
				pageNum = Integer.parseInt(pgNum);
			}
			if (!StringUtil.isNullOrEmpty(username)) {
				map.put("username", username);
				log.debug(username);
				model.addAttribute("username",username);
				request.setAttribute("username", username);
			}
			if (!StringUtil.isNullOrEmpty(orderField)) {
				map.put("orderField", orderField);
				request.setAttribute("orderField", orderField);
			}
			if (!StringUtil.isNullOrEmpty(orderDirection)) {
				map.put("orderDirection", orderDirection);
				request.setAttribute("orderDirection", orderDirection);
			}
			int totalCount = userService.queryUserCount(map);

			if (totalCount > 0) {
				map.put("start", (pageNum - 1) * 3);
				map.put("limit", 3);
				model.addAttribute("userList", userService.queryUser(map));
			}
			model.addAttribute("pageNum",pageNum);
			model.addAttribute("totalCount",totalCount);
			
			return getViewPath("/index");
		}	

		// 添加用户
		@RequestMapping(value = "/add", method = RequestMethod.GET)
		public String add(Model model) {
			return getViewPath("/add");
		}	

		// 验证用户名
		@RequestMapping(value = "/verify_user_name", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public String verifyUserName(@ModelAttribute("user") User user, Model model) {
			if(userService.loadUser(user.getUsername()) != null)return "false";
			return "true";
		}
		
		@RequestMapping(value = "/add", method = RequestMethod.POST)
		public String add(@ModelAttribute("user") User user, Model model) {
			if (!userService.add(user)) {
				return ajaxForwardError("增加失败");
			}
			return ajaxForwardSuccess("增加成功!");
		}
		
		

		// 跳转至修改页面
		@RequestMapping(value = "edit", method = RequestMethod.GET)
		public String toEditUser(@ModelAttribute("user") User user, Model model) {
			model.addAttribute("user", userService.loadUser(user.getId()));
			return getViewPath("/edit");
		}

		// 修改用户
		@RequestMapping(value = "edit", method = RequestMethod.POST)
		public String editUser(@ModelAttribute("user") User user, Model model) {
			if (!userService.edit(user)) {
				return ajaxForwardError("修改失败");
			}
			return ajaxForwardSuccess("修改成功!");
		}

		// 删除用户
		@RequestMapping("del")
		public String del(@ModelAttribute("user") User user) {
			if (!userService.del(user)) {
				return ajaxForwardError("修改失败");
			}
			return ajaxForwardSuccess("修改成功!");
		}
		
		
	

}