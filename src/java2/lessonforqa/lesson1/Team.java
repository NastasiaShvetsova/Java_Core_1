package java2.lessonforqa.lesson1;

import java.util.Random;

public class Team {
    private String nameTeam;
    private Competitor[] competitors;

    public Random random = new Random();

    public Team(String nameTeam, Competitor... competitors) {
        this.nameTeam = nameTeam;
        this.competitors = competitors;

    }

    public Team() {
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.printf("%s info:\n", nameTeam);
        for (Competitor competitor : competitors) {
            competitor.result();
            competitor.studentsInfo();
        }
    }

    public void positiveInfo() {
        System.out.printf("%s positive info:\n", nameTeam);
        for (Competitor competitor : competitors) {
            if (competitor.isOnQuestions()) competitor.result();
        }
    }
}




