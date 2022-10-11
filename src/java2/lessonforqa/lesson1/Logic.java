package java2.lessonforqa.lesson1;

public class Logic extends Session {
    private int questions;

    public Logic(int questions) {
        this.questions = questions;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.historyOfMagic(questions);
    }
}

