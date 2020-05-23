public class exam3 {
    abstract class Student {
        String studentName;
        String studentGroup;
        double averageGrade;

        public Student (String studentName, String studentGroup, double averageGrade) {
            this.studentName = studentName;
            this.studentGroup = studentGroup;
            this.averageGrade = averageGrade;
        }
        abstract double getGrant(double averageGrade);
    }
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
    public class MaleStudent extends Student {
        final double GRANT_SIZE = 4000;

        public MaleStudent(String studentName, String studentGroup, double averageGrade) {
            super(studentName, studentGroup, averageGrade);
        }

        @Override
        public double getGrant(double averageGrade) {
            if (averageGrade >= 4.0) {
                return GRANT_SIZE;
            }
            else return 0.0;
        }
    }
    enum Gender { MALE, FEMALE };

    class StudentFactory {
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
}


