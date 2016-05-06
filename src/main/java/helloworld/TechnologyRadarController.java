package helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TechnologyRadarController {

    @RequestMapping("/")
    public String index() {
        return "html/index.html";
    }

}
