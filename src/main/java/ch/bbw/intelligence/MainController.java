package ch.bbw.intelligence;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
public class MainController {

    private int count;
    private int total;
    private float startDeg;
    private boolean answer;
    ArrayList<Question> questions = new ArrayList<>();

    public MainController() {
        getQuestions();
    }

    public void plus(Question question) {
        if (question.getAnswer()) {
            question.getType().setValue(question.getType().getValue() + 2);
        } else {
            question.getType().setValue(question.getType().getValue() + 1);
        }
    }


    public void getQuestions() {
        questions.add(new Question(1, "Bist du gerne in der Natur?", Types.naturalistic_intelligence, answer));
        questions.add(new Question(2, "Nutzt du gerne Beobachtungswerkzeuge? (Mikroskope, Lupen etc.)", Types.naturalistic_intelligence, answer));
        questions.add(new Question(3, "Würdest du gerne einen Beruf ausüben, der in der Wissenschaft tätig ist?", Types.naturalistic_intelligence, answer));
        questions.add(new Question(4, "Verstehst du schnell wie Dinge funktionieren, auch wenn diese mal komplizierter sind?", Types.naturalistic_intelligence, answer));
        questions.add(new Question(5, "Hättest du gerne einen Garten?", Types.naturalistic_intelligence, answer));
        questions.add(new Question(6, "Übst du eine Sportart aus?", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(7, "Interessiert dich Muskelaufbau?", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(8, "Ist es dir wichtig, pünktlich zu sein?", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(9, "Bis du jemand, der alles perfekt haben will?", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(10, "Stehst du gerne auf der Tanzfläche und zeigst deine Moves?", Types.body_Kinesthetic_intelligence, answer));
        questions.add(new Question(11, "Hörst du anderen Menschen gerne und interessiert zu?", Types.interpersonal_intelligence, answer));
        questions.add(new Question(12, "Kannst du gut mit fremden Personen ein Gespräch anfangen?", Types.interpersonal_intelligence, answer));
        questions.add(new Question(13, "Hast du einen grossen Freundeskreis?", Types.interpersonal_intelligence, answer));
        questions.add(new Question(14, "Stellst du dich in einer Gruppe gerne in den Mittelpunkt und führst das Gespräch?", Types.interpersonal_intelligence, answer));
        questions.add(new Question(15, "Fällt es dir leicht, Menschen zu verstehen und mit ihnen zu fühlen?", Types.interpersonal_intelligence, answer));
        questions.add(new Question(16, "Bist du jemand, der sich immer weiterentwickeln will?", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(17, "Lernst du von Fehlern und versuchst alles zu geben, um es nicht zu wiederholen?", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(18, "Brauchst du Zeit, um über deine Handlungen/Taten zu denken und reflektieren?", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(19, "Arbeitest du gut alleine?", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(20, "Kannst du unabhängig von anderen Leben?", Types.intrapersonal_intelligence, answer));
        questions.add(new Question(21, "Liest du gerne?", Types.lingustic_intelligence, answer));
        questions.add(new Question(22, "Magst du es zu schreiben (Texte, Bücher etc.)?", Types.lingustic_intelligence, answer));
        questions.add(new Question(23, "Fällt es dir leicht Sprachen zu lernen?", Types.lingustic_intelligence, answer));
        questions.add(new Question(24, "Bist du gut in Grammatik?", Types.lingustic_intelligence, answer));
        questions.add(new Question(25, "Hast du ein grosses Vokabular in deiner bevorzugten Sprache (Synonyme etc.)?", Types.lingustic_intelligence, answer));
        questions.add(new Question(26, "Bist du ordentlich (Wohnung/Zimmer, Regale etc.)?", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(27, "Hast du ein gutes logisches Denkvermögen?", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(28, "Magst du Mathematik und hast du dort ein gutes Know-How?", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(29, "Analysierst du Dinge von einer kritischen Perspektive?", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(30, "Spielst du strategische Spiele (Solitare, Sudoku etc)?", Types.logical_Mathematical_skills, answer));
        questions.add(new Question(31, "Fühlst du jeden Ton, Rythmus und Melodie?", Types.musical_intelligence, answer));
        questions.add(new Question(32, "Komponierst du selber Lieder?", Types.musical_intelligence, answer));
        questions.add(new Question(33, "Spielst du eines oder mehrere Instrumente?", Types.musical_intelligence, answer));
        questions.add(new Question(34, "Hörst du bei Liedern die Instrumente heraus?", Types.musical_intelligence, answer));
        questions.add(new Question(35, "Hörst du täglich mehrere Stunden Musik?", Types.musical_intelligence, answer));
        questions.add(new Question(36, "Bist du gut in Geometrie?", Types.spacial_intelligence, answer));
        questions.add(new Question(37, "Hast du eine gute Orientierung?", Types.spacial_intelligence, answer));
        questions.add(new Question(38, "Fällt es dir einfach ein Würfel im Geiste zu drehen?", Types.spacial_intelligence, answer));
        questions.add(new Question(39, "Kannst du dir ein noch nicht gebautes Gebäude vorstellen?", Types.spacial_intelligence, answer));
        questions.add(new Question(40, "Kannst du dir vorstellen, wie viele Tische in einem Raum passen ohne zu wissen wie gross die Tische sind?", Types.spacial_intelligence, answer));
    }
    // Ja = 2 Punkte
    // Nein = 1 Punkt


    @GetMapping("/") // Zeigt die Frage
    public String umfrage(Model model) {
        model.addAttribute("setFrage", questions.get(0));
        Types.spacial_intelligence.setValue(0);
        Types.body_Kinesthetic_intelligence.setValue(0);
        Types.musical_intelligence.setValue(0);
        Types.lingustic_intelligence.setValue(0);
        Types.logical_Mathematical_skills.setValue(0);
        Types.interpersonal_intelligence.setValue(0);
        Types.intrapersonal_intelligence.setValue(0);
        Types.naturalistic_intelligence.setValue(0);
        count = 0;
        total = 0;
        startDeg = 0;
        return "question";
    }

    @PostMapping("/next") // Holt die nächste Frage und tut die beantwortete Frage weg
    public String nextUmfrage(@ModelAttribute("setFrage") Question question, Model model) {
        count++;
        plus(question);
        //questions = (ArrayList) questions.stream().filter(questionElement -> questionElement.getId() != question.getId()).collect(Collectors.toList());
        if (count < 40) {
            model.addAttribute("setFrage", questions.get(count));
            return "question";
        } else {
            for (Types type : Types.values()) {
                total += type.getValue();
            }
            for (Types type : Types.values()) {
                model.addAttribute(type.name(), type.getValue());
                model.addAttribute("css_"+type.name(), ((360 / total * type.getValue()) + startDeg));
                startDeg += 360 / total * type.getValue();
            }
            return "result";
        }
    }
}
