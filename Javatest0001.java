
public class Javatest0001 {

    public static void main(String[] args) {

        int n = 5;

        // Upper Part
        for (int i = 1; i <= n; i++) {

            // spaces before star
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower Part
        for (int i = n - 1; i >= 1; i--) {

            // spaces before star
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
