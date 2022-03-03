package taskFour;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;


public class CustonPrintNumber {


    public static void printNumber(Integer str) {
        int width = 100;
        int height = 30;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.PLAIN, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//        String n = (str);
//        char[] charArray = n.toCharArray();
//        ArrayList<String> cia = new ArrayList<>();
//        for (int i = 0; i < charArray.length; i++) {
//            int c = Character.getNumericValue(charArray[i]);
//            cia.add(String.valueOf(c));
//        }

        graphics.drawString(String.valueOf(str), 10, 20);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++)
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "*");
            if (sb.toString().trim().isEmpty())
                continue;
            System.out.println(sb);

        }
    }

}



