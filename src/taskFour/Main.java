package taskFour;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A line: ");
        int stringNumbers = in.nextInt();
        CustonPrintNumber.printNumber(stringNumbers);
    }
}
