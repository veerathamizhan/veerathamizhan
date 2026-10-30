import java.util.Arrays;

public class Selectionsort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // Find the smallest value in the unsorted portion
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Move the smallest value to the current position
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
