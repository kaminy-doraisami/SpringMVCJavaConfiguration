package com.learnSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learnSpring.model.Person;

@Controller
public class RegistrationController {
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView model = new ModelAndView("register");
		return model;
	}

	@RequestMapping(value = "/success.html", method = RequestMethod.POST)
	public ModelAndView success(@ModelAttribute ("personModel") Person person) {

		ModelAndView model = new ModelAndView("success");
		return model;
	}
}
