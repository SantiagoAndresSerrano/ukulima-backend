package ufps.ukulima.infrastructure.entry_points.rest.$notfound;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/error")
@CrossOrigin
public class NotFoundRest {
    @GetMapping
    @ResponseBody
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("404.html");
        return modelAndView;
    }
}
