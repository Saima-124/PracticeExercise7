
    import java.util.Scanner;

    public class ReverseOrder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[10];

            System.out.println("Enter ten numbers:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Numbers in reverse order:");
            for (int i = 9; i >= 0; i--) {
                System.out.println(numbers[i]);
            }


        }
    }


