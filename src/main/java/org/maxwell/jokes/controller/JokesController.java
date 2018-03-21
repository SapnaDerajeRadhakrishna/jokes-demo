package org.maxwell.jokes.controller;

import org.maxwell.jokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

	private JokesService jokesService;

	@Autowired
	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping("/")
	public String showJoke(Model model) {
		model.addAttribute("joke", jokesService.tellAJoke());
		return "chucknorris";
	}

}
