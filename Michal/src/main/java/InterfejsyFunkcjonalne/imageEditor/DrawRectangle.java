package InterfejsyFunkcjonalne.imageEditor;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawRectangle implements Operation{
    @Override
    public void execute(BufferedImage image) {
        Graphics2D g = image.createGraphics();
        g.setColor(Color.MAGENTA);
        g.setStroke(new BasicStroke(20));
        g.drawRect(0,0, image.getWidth(),image.getHeight());
    }
}
