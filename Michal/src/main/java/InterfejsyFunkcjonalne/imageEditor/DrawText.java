package InterfejsyFunkcjonalne.imageEditor;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawText implements Operation{
    @Override
    public void execute(BufferedImage image) {
        Font font = new Font("TimesRoman",Font.BOLD,150);
        Graphics2D g = image.createGraphics();

        g.setColor(Color.YELLOW);
       // g.setStroke(new BasicStroke(20));
        g.setFont(font);
        g.drawString("Kocham Kasię", image.getWidth()/2-500,image.getHeight()/2);
    }
}
