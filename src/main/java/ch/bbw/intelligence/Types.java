package ch.bbw.intelligence;
public enum Types {

    spacial_intelligence(0),
    body_Kinesthetic_intelligence(0),
    musical_intelligence(0),
    lingustic_intelligence(0),
    logical_Mathematical_skills(0),
    interpersonal_intelligence(0),
    intrapersonal_intelligence(0),
    naturalistic_intelligence(0);

    private int value;

    Types(int value) {
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

