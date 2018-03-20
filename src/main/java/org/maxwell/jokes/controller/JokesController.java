package org.maxwell.jokes.controller;

import org.maxwell.jokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

	private JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping("/")
	public String getBooks(Model model) {
		model.addAttribute("joke", jokesService.tellAJoke());
		return "chucknorris";
	}

}
