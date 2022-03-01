package taskTwo;

import java.util.Scanner;

public class CustomMath {


    public static void printResultPrimeNumbers(){

        double number = checkInputLineUser();
        CustomMath.searchPrimeNumbers(number);
    }

    private static double checkInputLineUser(){
        double number;
        System.out.println("Enter the prime number: ");
        Scanner scanner = new Scanner(System.in);
        while ((number = scanner.nextDouble()) % 1 != 0) {
            System.out.println("They didn't output a prime number\n" +
                    "Try again: ");
        }

        return number;
    }

    private static void searchPrimeNumbers(double number){
        int twoInt = 2;
        while (number !=1) {
            if (number % twoInt == 0){
                System.out.println(twoInt + "  ");
                number /= twoInt;
            } else if (twoInt == 2){
                twoInt++;
            } else {
                twoInt += 2;
            }
        }
    }
}
