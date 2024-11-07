package dci.docker_test;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AppController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Joe");
        return "index";
    }
}
