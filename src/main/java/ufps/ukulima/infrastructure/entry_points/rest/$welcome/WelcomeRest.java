package ufps.ukulima.infrastructure.entry_points.rest.$welcome;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping({"/","/api"})
@CrossOrigin
public class WelcomeRest {
    @GetMapping
    @ResponseBody
    public ModelAndView  welcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome.html");
        return modelAndView;
    }
}
