public class VoterEligibility {
    public static void main(String[] args) {
        int age = 17;

        boolean isEligibleToVote = age >= 18;

        System.out.println("Age: " + age);
        System.out.println("Eligible to vote: " + isEligibleToVote);
    }
} 