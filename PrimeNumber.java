public class PrimeNumber {
    public static boolean isPrime(int number) { // This method takes an integer number as input and checks if it is a prime number.
        if (number <= 1) { // It first checks if the number is less than or equal to 1. If it is, the method returns false since 1 and numbers less than 1 are not prime.
            return false;
        }
        for (int i = 2; i < number; i++) { // It then uses a for loop to iterate from 2 to number -1.
            if (number % i == 0) { // In each iteration, the loop checks if the number is divisible by the loop counter i. If it is, the method returns false since number is not prime.
                return false;
            }
        }
        return true; // If the loop finishes without finding any divisor for number, the method returns true, indicating that number is prime.
    }

    public static void main(String[] args) {
        int number = 17; // Inside the main method, an integer variable number is initialized with the value 17.
        if (isPrime(number)) { // The isPrime method is then called with the number as an argument, and the result is stored in a boolean variable. The program prints whether the number is prime or not to the console using System.out.println.
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
