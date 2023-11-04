package ca.pitt.wet.cdts.demo.wetcdtsspringboot.controllers.section2;

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
@RequestMapping(path = "/section2")
public class Section2Controller {

    /**
     * Get nav.
     *
     * @return <code>ModelAndView</code>
     */
    @GetMapping("/itemA")
    public ModelAndView getNav() {
        return new ModelAndView("section2/itemA");
    }

    /**
     * Post nav.
     *
     * @return <code>ModelAndView</code>
     */
    @GetMapping("/itemB")
    public ModelAndView postNav() {
        return new ModelAndView("section2/itemB");
    }
}
