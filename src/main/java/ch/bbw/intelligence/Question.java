package ch.bbw.intelligence;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

    int id;
    String question;
    Types type;
    Boolean answer;

    public Question() {
    }

    public Question(int id, String question, Types type, Boolean answer) {
        this.id = id;
        this.question = question;
        this.type = type;
        this.answer = answer;
    }
}