package exam3;

public abstract class Student {
    public String studentName;
    public String studentGroup;
    public double averageGrade;

    public Student(String studentName, String studentGroup, double averageGrade) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.averageGrade = averageGrade;
    }

    public abstract double getGrant();
}
