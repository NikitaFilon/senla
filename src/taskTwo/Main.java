package taskTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();
        double number = getUserInput();
        System.out.println(customMath.searchPrimeNumbers(number));
    }

    private static double getUserInput(){
        double number;
        System.out.println("Enter the prime number: ");
        Scanner scanner = new Scanner(System.in);
        while ((number = scanner.nextDouble()) % 1 != 0) {
            System.out.println("They didn't output a prime number\n" +
                    "Try again: ");
        }
        return number;
    }

}
