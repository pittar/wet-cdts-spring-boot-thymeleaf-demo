package ca.pitt.wet.cdts.demo.wetcdtsspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home Controller.
 * @author Andrew Pitt
 * @since 1.0.0
 */
@Controller
@RequestMapping(path="/home")
public class HomeController {

	/**
	 * Get home.
	 * @return <code>ModelAndView</code>
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
}
