public class OverloadedAdd {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result1 = add(10, 20);
        double result2 = add(5.5, 4.5);

        System.out.println("Integer result: " + result1);
        System.out.println("Double result: " + result2);
    }
}