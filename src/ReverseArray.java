
    public class ReverseArray {
        public static void main(String[] args) {
            int[] array = {1, 4, 9, 16, 9, 7, 4, 9, 11};
            System.out.println("Original array:");
            printArray(array);

            reverseArray(array);

            System.out.println("\nReversed array:");
            printArray(array);
        }

        public static void reverseArray(int[] array) {
            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                // Swap elements at start and end indices
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                // Move to the next pair of elements
                start++;
                end--;
            }
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }


