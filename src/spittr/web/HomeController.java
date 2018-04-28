package spittr.web;

import org.springframework.stereotype.Controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RequestMapping;
	
@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping(method=GET) 
public String home() { return "home";}
}
