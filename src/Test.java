public class Test {
    public static void main(String[] args) {
        exam3.StudentFactory students = new exam3.StudentFactory();
        exam3.Student anna = students.makeStudent("Anna", "first", exam3.Gender.FEMALE, 4.5);
    }
}
