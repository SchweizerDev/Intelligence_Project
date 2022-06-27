package ch.bbw.intelligence;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    boolean answer;
    public void getQuestions() {
        questions.add(new Question(1, "", Types.naturalistic_intelligence, answer));
        questions.add(new Question(2, "", Types.naturalistic_intelligence, answer));
        questions.add(new Question(3, "", Types.naturalistic_intelligence, answer));
        questions.add(new Question(4, "", Types.naturalistic_intelligence, answer));
        questions.add(new Question(5, "", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(6, "", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(7, "", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(8, "", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(9, "", Types.interpersonal_intelligence, answer));
        questions.add(new Question(10, "", Types.interpersonal_intelligence, answer));
        questions.add(new Question(11, "", Types.interpersonal_intelligence, answer));
        questions.add(new Question(12, "", Types.interpersonal_intelligence, answer));
        questions.add(new Question(13, "", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(14, "", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(15, "", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(16, "", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(17, "", Types.lingustic_intelligence, answer));
        questions.add(new Question(18, "", Types.lingustic_intelligence, answer));
        questions.add(new Question(19, "", Types.lingustic_intelligence, answer));
        questions.add(new Question(20, "", Types.lingustic_intelligence, answer));
        questions.add(new Question(21, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(22, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(23, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(24, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(25, "", Types.musical_intelligence, answer));
        questions.add(new Question(26, "", Types.musical_intelligence, answer));
        questions.add(new Question(27, "", Types.musical_intelligence, answer));
        questions.add(new Question(28, "", Types.musical_intelligence, answer));
        questions.add(new Question(29, "", Types.spacial_intelligence, answer));
        questions.add(new Question(30, "", Types.spacial_intelligence, answer));
        questions.add(new Question(31, "", Types.spacial_intelligence, answer));
        questions.add(new Question(32, "", Types.spacial_intelligence, answer));

    }

    ArrayList<Question> questions;




    @GetMapping("/umfrage")
    public String umfrage(Question question, Model model) {
        model.addAttribute("question", questions);

        return "question";
    }

    @PostMapping("/Relutat")
    public String result(){
        return "result";
    }

}
