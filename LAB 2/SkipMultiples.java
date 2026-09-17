public class SkipMultiples {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                if (i == 18) {
                    break;
                }
                continue;
            }

            System.out.println(i);
        }
    }
}