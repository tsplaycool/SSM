package cn.wpstan.ssm.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.wpstan.ssm.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Resource
	private UserServiceImpl userService;

	@RequestMapping("/users")
	public ModelAndView Users() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("users");
		mv.addObject("users", userService.getUsers());
		return mv;
	}
}
