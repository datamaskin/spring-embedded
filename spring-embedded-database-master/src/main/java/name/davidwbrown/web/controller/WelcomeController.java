package name.davidwbrown.web.controller;

import java.util.List;

import name.davidwbrown.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import name.davidwbrown.dao.UserDao;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {

		logger.debug("davidwbrown");

		User user = userDao.findByName("david");
		
		List<User> users = userDao.findAll();

		System.out.println(users);

		model.addAttribute("user", users);
		
		return "Raw DB DAO";

	}

}