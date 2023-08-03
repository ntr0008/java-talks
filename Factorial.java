public class Factorial {
    public static int factorial(int n) { // This method takes an n as input and calculates the factorial of n.
        int result = 1; // Then we make a variable called result which is equal to 1, which will store the final factorial value.
        for (int i = 1; i <= n; i++) { // Then we use a for loop to iterate from 1 to n.
            result *= i; // In each iteration, the loop multiplies the result by the loop counter i. After the loop finishes, the result will hold the factorial of n.
        }
        return result; // The method returns the result as the output.
    }

    public static void main(String[] args) {
        int number = 5; // Here we make a variable called number that is equal to 5.
        int result = factorial(number); // the factorial method is then called with the number as an argument, and the result is stored in the variable result.
        System.out.println("Factorial of " + number + " is: " + result); // Finally, the program prints the result to the console using System.out.println.
    }
}
