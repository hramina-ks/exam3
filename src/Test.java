public class Test {
    public static void main(String[] args) {
        exam3.StudentFactory factory = new exam3.StudentFactory();
        exam3.Student[] students = {
                exam3.StudentFactory.makeStudent("Anna", "first", exam3.Gender.FEMALE,3.5),
                exam3.StudentFactory.makeStudent("John", "first", exam3.Gender.MALE,4),
                exam3.StudentFactory.makeStudent("Peter", "first", exam3.Gender.MALE,3)
        };
        System.out.println(students);
    }
}

