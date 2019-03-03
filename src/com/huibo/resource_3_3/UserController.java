package com.huibo.resource_3_3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/add_user")
	public ModelAndView getUser(@RequestParam("name") String name) {
		ModelAndView view = new ModelAndView();
		Map<String,Object> map = new HashMap<>();
		map.put("name", "ÕÅÈý");
		map.put("age", "21");
		view.setViewName("redirect:index.jsp");
		view.addObject("message","aaa");
		System.out.println(name);
		return view; 
	}
}
