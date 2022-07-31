package ufps.ukulima.infrastructure.entry_points.rest.$welcome;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping({"/","/api"})
public class WelcomeRest {
    @GetMapping
    @ResponseBody
    public ModelAndView  welcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome.html");
        return modelAndView;
    }
}
