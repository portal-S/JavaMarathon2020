package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Анна Владимировна", "русский язык");
        Student student = new Student("Пертов Сергей");
        teacher.evaluate(student);
    }
}
