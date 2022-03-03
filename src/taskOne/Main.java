package taskOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();
        String str = getUserInput();
        System.out.println("The amount: " + customMath.sumOfNumber(str));
    }

    private static String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("A line: ");
        String str = in.nextLine();
        return str;
    }

}
