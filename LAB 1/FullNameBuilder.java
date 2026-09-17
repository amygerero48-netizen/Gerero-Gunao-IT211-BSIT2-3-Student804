public class FullNameBuilder {
    public static void main(String[] args) {
        String firstName = "Amy";
        String middleInitial = "D.";
        String lastName = "Gerero";

        String fullName = firstName + " " + middleInitial + " " + lastName;
        int letters = fullName.replace(" ", "").replace(".", "").length();

        System.out.println("Full Name: " + fullName);
        System.out.println(fullName + " has " + letters + " letters in his full name.");
    }
}