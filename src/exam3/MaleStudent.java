package exam3;

public class MaleStudent extends Student {
    final double GRANT_SIZE = 4000;

    public MaleStudent(String studentName, String studentGroup, double averageGrade) {
        super (studentName, studentGroup, averageGrade);
    }

    @Override
    public double getGrant() {
        if (this.averageGrade >= 4.0) {
            return GRANT_SIZE;
        } else return 0.0;
    }
}
