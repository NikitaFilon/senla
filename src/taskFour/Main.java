package taskFour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CustomPrintNumber customPrintNumber = new CustomPrintNumber();
        Scanner in = new Scanner(System.in);
        System.out.print("A line: ");
        int stringNumber = in.nextInt();
        customPrintNumber.printNumber(stringNumber);
    }

}
