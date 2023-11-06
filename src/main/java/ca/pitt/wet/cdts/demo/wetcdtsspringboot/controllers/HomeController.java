package ca.pitt.wet.cdts.demo.wetcdtsspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home Controller.
 *
 * @author Andrew Pitt
 * @since 1.0.0
 */
@Controller
public class HomeController {

    /**
     * Get home.
     *
     * @return <code>ModelAndView</code>
     */
    @RequestMapping(path = {"/", "/home"})
    @GetMapping()
    public ModelAndView getHome() {
        return new ModelAndView("home");
    }

    /**
     * Get home.
     *
     * @return <code>ModelAndView</code>
     */
    @RequestMapping(path = "/home-application-layout")
    @GetMapping()
    public ModelAndView getHomeAplication() {
        return new ModelAndView("home-application-layout");
    }

    /**
     * Get home.
     *
     * @return <code>ModelAndView</code>
     */
    @RequestMapping(path = "/home-transactional-layout")
    @GetMapping()
    public ModelAndView getHomeTransactional() {
        return new ModelAndView("home-transactional-layout");
    }

    /**
     * Get home.
     *
     * @return <code>ModelAndView</code>
     */
    @RequestMapping(path = "/home-transactional-leftmenu-layout")
    @GetMapping()
    public ModelAndView getHomeTransactionalLeftMenu() {
        return new ModelAndView("home-transactional-leftmenu-layout");
    }

}
