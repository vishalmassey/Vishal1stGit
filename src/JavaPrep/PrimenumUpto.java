package JavaPrep;

import java.util.Scanner;

public class PrimenumUpto {

    // Method to check if a number is prime without using Math.sqrt
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i*i <= num; i++) { // equivalent to checking up to sqrt(num)
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
