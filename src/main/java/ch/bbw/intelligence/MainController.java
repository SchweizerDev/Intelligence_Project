package ch.bbw.intelligence;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
public class MainController {

    boolean answer;
    ArrayList<Question> questions = new ArrayList<Question>();

    public MainController() {
        getQuestions();
    }

    public void plus (Question question) {
        if (answer) {
            question.type.setValue(question.type.getValue()+2);
        } else {
            question.type.setValue(question.type.getValue()+1);
        }
    }


    public void getQuestions() {
        questions.add(new Question(1, "asdfsdaf", Types.naturalistic_intelligence, answer));
        questions.add(new Question(2, "asdfasd", Types.naturalistic_intelligence, answer));
        questions.add(new Question(3, "fdas", Types.naturalistic_intelligence, answer));
        questions.add(new Question(4, "adf", Types.naturalistic_intelligence, answer));
        questions.add(new Question(5, "asdf", Types.naturalistic_intelligence, answer));
        questions.add(new Question(6, "asdf", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(7, "asdf", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(8, "asdf", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(9, "asdf", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(10, "asdf", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(11, "asdf", Types.interpersonal_intelligence, answer));
        questions.add(new Question(12, "adsf", Types.interpersonal_intelligence, answer));
        questions.add(new Question(13, "asdfsdaf", Types.interpersonal_intelligence, answer));
        questions.add(new Question(14, "asdfsdaf", Types.interpersonal_intelligence, answer));
        questions.add(new Question(15, "asdfsdaf", Types.interpersonal_intelligence, answer));
        questions.add(new Question(16, "asdfsdaf", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(17, "asdfsdaf", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(18, "asdfsdaf", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(19, "asdfsdaf", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(20, "asdfsdaf", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(21, "asdfsdaf", Types.lingustic_intelligence, answer));
        questions.add(new Question(22, "asdfsdaf", Types.lingustic_intelligence, answer));
        questions.add(new Question(23, "asdfsdaf", Types.lingustic_intelligence, answer));
        questions.add(new Question(24, "asdfsdaf", Types.lingustic_intelligence, answer));
        questions.add(new Question(25, "asdfsdaf", Types.lingustic_intelligence, answer));
        questions.add(new Question(26, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(27, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(28, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(29, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(30, "", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(31, "", Types.musical_intelligence, answer));
        questions.add(new Question(32, "", Types.musical_intelligence, answer));
        questions.add(new Question(33, "", Types.musical_intelligence, answer));
        questions.add(new Question(34, "", Types.musical_intelligence, answer));
        questions.add(new Question(35, "", Types.musical_intelligence, answer));
        questions.add(new Question(36, "", Types.spacial_intelligence, answer));
        questions.add(new Question(37, "", Types.spacial_intelligence, answer));
        questions.add(new Question(38, "", Types.spacial_intelligence, answer));
        questions.add(new Question(39, "", Types.spacial_intelligence, answer));
        questions.add(new Question(40, "asdfsdaf", Types.spacial_intelligence, answer));

    }
    // Ja = 2 Punkte
    // Nein = 1 Punkt


    @GetMapping("/")
    public String umfrage(Model model) {
        model.addAttribute("getFrage", questions);
        return "question";
    }

    @GetMapping("/next")
    public String nextUmfrage(Question question, Model model) {
        questions = (ArrayList) questions.stream().filter(questionElement -> questionElement.id != question.id).collect(Collectors.toList());
        model.addAttribute("getFrage", questions);
        return "question";
    }


}
