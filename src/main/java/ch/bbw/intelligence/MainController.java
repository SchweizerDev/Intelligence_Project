package ch.bbw.intelligence;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/Umfrage")
    public String umfrage(Question question, Model model){


        return "question";
    }

}
