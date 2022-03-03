package taskFour;

import java.awt.*;
import java.awt.image.BufferedImage;


public class CustomPrintNumber {
    private final int width = 100;
    private final int height = 30;

    public void printNumber(Integer str) {
            transferArrayToString(str);
    }

    public BufferedImage transferIntegerToGraphics(Integer integer) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.PLAIN, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        graphics.drawString(String.valueOf(integer), 10, 20);
        return image;

    }

    public void transferArrayToString(Integer number) {

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++)
                sb.append(checkNull(transferIntegerToGraphics(number), x, y));
            if (sb.toString().trim().isEmpty())
                continue;
            System.out.println(sb);
        }
    }

    public String checkNull(BufferedImage image, int x, int y) {
        String str = " ";
        if (image.getRGB(x, y) == -16777216) {
            str = " ";
        } else {
            str = "*";
        }
        return str;
    }

}



