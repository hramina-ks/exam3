public class exam3old {
    public class StudentFactory {
        private String studentName;
        private String group;
        private double averageGrade;

        public Student getStudent(String studentName, StudentGender gender) {
            Student toReturn = null;
            switch (gender) {
                case MALE:
                    toReturn = new MaleStudent();
                    break;
                case FEMALE:
                    toReturn = new FemaleStudent();
                    break;
            }
            return toReturn;
        }
    }
    public interface Student {
        double getGrant(double averageGrade);
    }

    public enum StudentGender {
        MALE,
        FEMALE
    }
    public class MaleStudent implements Student {
        final double GRANT_SIZE = 4000;
        @Override
        public double getGrant(double averageGrade) {
            if (averageGrade >= 4.0) {
                return GRANT_SIZE;
            }
            else return 0.0;
        }
    }
    public class FemaleStudent implements Student {
        static final double GRANT_FACTOR = 1000;
        @Override
        public double getGrant(double averageGrade) {
            return averageGrade * this.GRANT_FACTOR;
        }
    }


}