package ufps.ukulima.infrastructure.entry_points.rest.$notfound;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/error")
public class NotFoundRest {
    @GetMapping
    @ResponseBody
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("404.html");
        return modelAndView;
    }
}
