package exam3;

public class StudentFactory {
    public Student makeStudent(String name, String group, Gender gender, double averageGrade) {
        if (gender == Gender.MALE) {
            return new MaleStudent(name, group, averageGrade);
        } else if (gender == Gender.FEMALE) {
            return new FemaleStudent(name, group, averageGrade);
        } else {
            throw new RuntimeException("Gender is wrong");
        }
    }
}
