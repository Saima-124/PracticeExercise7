
public class LargestInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 30, 15};

        int largest = array[0];
        int smallest = array[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                largestIndex = i;
            }
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        System.out.println("Largest element: " + largest + " at index " + largestIndex);
        System.out.println("Smallest element: " + smallest + " at index " + smallestIndex);
    }
}
