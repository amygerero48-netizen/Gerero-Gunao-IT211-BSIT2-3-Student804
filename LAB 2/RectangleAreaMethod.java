public class RectangleAreaMethod {

    static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        int area1 = calculateArea(10, 5);
        int area2 = calculateArea(8, 4);

        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);
    }
}