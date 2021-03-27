package com.nikcode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Naresh Gupta on 27/3/2021 AD.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("message", "Hello Spring MVC Application");
        return "hello";
    }
}
