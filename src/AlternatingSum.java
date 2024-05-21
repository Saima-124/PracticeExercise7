
    import java.util.Scanner;

    public class AlternatingSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the elements of the array separated by spaces:");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            int[] array = new int[tokens.length];

            // Convert input tokens to integers
            for (int i = 0; i < tokens.length; i++) {
                array[i] = Integer.parseInt(tokens[i]);
            }

            int alternatingSum = computeAlternatingSum(array);
            System.out.println("Alternating sum: " + alternatingSum);

            scanner.close();
        }

        public static int computeAlternatingSum(int[] array) {
            int sum = 0;
            boolean add = true;
            for (int i = 0; i < array.length; i++) {
                if (add) {
                    sum += array[i];
                } else {
                    sum -= array[i];
                }
                add = !add; // Flip the add flag
            }

            return sum;
        }
    }


