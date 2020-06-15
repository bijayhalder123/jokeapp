package com.bijay.jokeapp.jokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bijay.jokeapp.jokeapp.service.JokeAppService;

@Controller
@RequestMapping("/api")
public class jokeappcontroller {

	private JokeAppService jokeAppService;
	
	public jokeappcontroller(JokeAppService theJokeAppService) {
		this.jokeAppService = theJokeAppService;
	}

	@RequestMapping("/jokess")
	public String getJoke(Model model)
	{
		model.addAttribute("joke", jokeAppService.getJoke());
		return "jokeview";
	}
}
