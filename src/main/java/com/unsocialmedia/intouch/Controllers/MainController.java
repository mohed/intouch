package com.unsocialmedia.intouch.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mohed on 2017-04-26.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}