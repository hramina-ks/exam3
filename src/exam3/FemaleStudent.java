package exam3;

public class FemaleStudent extends Student{
    static final double GRANT_FACTOR = 1000;

    public FemaleStudent(String studentName, String studentGroup, double averageGrade) {
        super(studentName, studentGroup, averageGrade);
    }

    @Override
    public double getGrant(double averageGrade) {
        return averageGrade * this.GRANT_FACTOR;
    }
}
