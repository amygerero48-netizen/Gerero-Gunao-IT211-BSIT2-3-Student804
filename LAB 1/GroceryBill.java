public class GroceryBill {
    public static void main(String[] args) {
        double item1 = 50.00;
        double item2 = 75.50;
        double item3 = 100.00;

        double total = item1 + item2 + item3;

        double tax = total * 0.12;
        total += tax;

        System.out.println("Subtotal: " + (item1 + item2 + item3));
        System.out.println("Tax: " + tax);
        System.out.println("Final Total: " + total);
    }
}