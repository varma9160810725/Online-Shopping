package com.var.OnlineShoppingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index()
	{
		///added page
		ModelAndView mv=new ModelAndView("page");
		mv .addObject("title","home");
		mv.addObject("userClicksHome",true);
		return mv;
	}
	@RequestMapping(value= "/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClicksAbout",true);
		return mv;
	}
	@RequestMapping(value= "/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClicksContact",true);
		return mv;
	}

}
