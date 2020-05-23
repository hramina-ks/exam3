import exam3.*;
public class Test {
    public static void main(String[] args) {
        StudentFactory factory = new StudentFactory();
        Student[] students = {
                factory.makeStudent("Anna", "first", Gender.FEMALE,2.5),
                factory.makeStudent("John", "first", Gender.MALE,2),
                factory.makeStudent("Peter", "first", Gender.MALE,5)
        };
        for (Student student: students) {
            System.out.print(student.studentName);
            System.out.print(" - ");
            System.out.print(student.getGrant(student.averageGrade));
            System.out.println();
        }
    }
}

