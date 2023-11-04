package ca.pitt.wet.cdts.demo.wetcdtsspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home Controller.
 * 
 * @author Andrew Pitt
 * @since 1.0.0
 */
@Controller
@RequestMapping(path = "/nav")
public class LeftNavController {

	/**
	 * Get nav.
	 * 
	 * @return <code>ModelAndView</code>
	 */
	@GetMapping
	public ModelAndView getNav() {
		return new ModelAndView("nav");
	}

	/**
	 * Post nav.
	 * 
	 * @return <code>ModelAndView</code>
	 */
	@PostMapping
	public ModelAndView postNav() {
		return new ModelAndView("nav");
	}
}
