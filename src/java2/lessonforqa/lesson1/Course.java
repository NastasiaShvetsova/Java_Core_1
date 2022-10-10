package java2.lessonforqa.lesson1;

public class Course {
    private Session[] sessions;

    public Course(Session... sessions) {
        this.sessions = sessions;
    }

    public void doIt(Team team) {
        for (Competitor c : team.getCompetitors()) {
            for (Session s : sessions) {
                s.doIt(c);
                if (!c.isOnQuestions()) break;
            }
        }
    }
}

