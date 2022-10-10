package java2.lessonforqa.lesson1;

public class Main {
    public static void main(String[] args) {

        //Создаем команду
        Team team = new Team("Gryffindor",
                new Students("Ron", "Weasley"),
                new Students("Harry", "Potter"),
                new Students("Нermione", "Granger"),
                new Students("Draco", "Malfoy"));
        //Создаем полосу препятствий
        Course course = new Course(new Logic(100), new Practice(100));
        //Просим команду пройти полосу(экзамен)
        course.doIt(team);
        System.out.println();
        // Показываем результаты
        team.showResults();
        System.out.println();
        team.positiveInfo();
    }
}

