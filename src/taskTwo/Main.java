package taskTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the prime number: ");
        Scanner scanner = new Scanner(System.in);
        double number;
        while ((number = scanner.nextDouble()) % 1 != 0) {
            System.out.println("They didn 't output a prime number \n " +
                    "Try again: ");
        }
        CustomMath.searchPrimeNumbers(number);

    }
}
