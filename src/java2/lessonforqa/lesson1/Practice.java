package java2.lessonforqa.lesson1;

public class Practice extends Session {
    private int questions;

    public Practice(int questions) {
        this.questions = questions;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.potion(questions);
    }
}

