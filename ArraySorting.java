
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9}; // Here we make a variable called numbers which is also our array.
        Arrays.sort(numbers); // The Arrays.sort method is then called, which sorts the array in ascending order.
        System.out.print("Sorted Array: "); // After sorting the program prints "Sorted Array: " to the console.
        for (int number : numbers) { // Then we use a for loop to iterate through each element of the sorted array and prints each element followed by a space.
            System.out.print(number + " ");
        }
    }
}
