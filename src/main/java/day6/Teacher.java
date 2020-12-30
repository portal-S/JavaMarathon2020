package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        int score = (int) ((Math.random() * ((5 - 2) + 1)) + 2);
        System.out.println(score);
        String scoreName;
        switch (score){
            case (2):
                scoreName = "неудовлетворительно";
                break;
            case (3):
                scoreName = "удовлетворительно";
                break;
            case (4):
                scoreName = "хорошо";
                break;
            case (5):
                scoreName = "отлично";
                break;
            default:
                scoreName = "null";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.", name, student.getName(), subject, scoreName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
