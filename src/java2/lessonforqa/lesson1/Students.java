package java2.lessonforqa.lesson1;


public class Students extends Team implements Competitor {
    protected String name;
    protected String surname;

    protected int maxResultPotion;
    protected int maxResultHistoryOfMagic;

    protected boolean onQuestions;

    @Override
    public boolean isOnQuestions() {
        return onQuestions;
    }


    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.maxResultPotion = random.nextInt(20) + 90 ;
        this.maxResultHistoryOfMagic = random.nextInt(20) + 90;
        this.onQuestions = true;

    }

    public void potion(int questions) {
        if (this.maxResultPotion >= questions) {
            onQuestions = true;
        } else {
            onQuestions = false;
        }
    }

    public void historyOfMagic(int questions) {
        if (this.maxResultHistoryOfMagic >= questions) {
            onQuestions = true;
        } else {
            onQuestions = false;
        }
    }
    public void studentsInfo() {
        System.out.println(this.name + " " + this.surname + " Potion: " + this.maxResultPotion + ", History_of_Magic: " + this.maxResultHistoryOfMagic);
    }

    public void result() {
        System.out.println(this.name + " " + this.surname + ": " + this.onQuestions);
    }
}


