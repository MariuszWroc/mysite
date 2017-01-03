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
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String getAbout() {
		return "about";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContact() {
		return "main/contact";
	}
	
    @RequestMapping(value = {"/header"}, method = RequestMethod.GET)
    public String getHeaderTemplate() {
        return "template/header";
    }
    
    @RequestMapping(value = {"/left"}, method = RequestMethod.GET)
    public String getContentTemplate() {
        return "template/left";
    }
    
    @RequestMapping(value = {"/footer"}, method = RequestMethod.GET)
    public String getFooterTemplate() {
        return "template/footer";
    }
}
