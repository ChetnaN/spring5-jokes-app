package cnegi.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cnegi.springframework.joke.services.JokeServices;

@Controller
public class JokeController {
	private JokeServices jokeServices;

	@Autowired
	public JokeController(JokeServices jokeServices) {
		this.jokeServices = jokeServices;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeServices.getJoke());
		return "joke";
	}

}
