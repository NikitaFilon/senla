package taskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A string: ");
        String stringNumbers = in.nextLine();
        System.out.println("The amount: " + CustomMath.sumOfNumber(stringNumbers));
    }
}
