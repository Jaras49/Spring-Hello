package Jaras49.HelloWorld.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(ModelMap modelmap){
        modelmap.put("hello", "Hello Spring ");
        return "hello";
    }
}
