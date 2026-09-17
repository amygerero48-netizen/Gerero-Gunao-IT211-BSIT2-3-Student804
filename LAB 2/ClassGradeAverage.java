public class ClassGradeAverage {
    public static void main(String[] args) {

        int[] grades = {88, 92, 79, 95, 84};

        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        double average = (double) total / grades.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}