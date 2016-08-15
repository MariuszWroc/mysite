package pl.mariuszczarny.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}	
	
	@RequestMapping(value = "/aboutme", method = RequestMethod.GET)
	public String getAboutMe(Model model) {
		return "aboutme";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContact(Model model) {
		return "contact";
	}
}
