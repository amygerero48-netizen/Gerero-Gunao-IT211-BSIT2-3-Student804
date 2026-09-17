public class GradeClassifier {
    public static void main(String[] args) {

        int score = 84;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}