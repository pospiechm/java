package InterfejsyFunkcjonalne.imageEditor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEditor {
    private BufferedImage imageTemp;

    public void loadImage(String filename) {
        try {
            if (filename == null || filename.isEmpty()) {
                System.out.println("Filename is empty.");
            } else {
                imageTemp = ImageIO.read(new File(getClass().getClassLoader().getResource(filename).getFile()));
                System.out.println("Successfuly loaded image " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void perform(Operation operation){
        operation.execute(imageTemp);
        }
    public void saveImage() {
        try {
            if (imageTemp == null) {
                System.out.println("There's no image to save.");
            } else {
                ImageIO.write(imageTemp, "jpg", new File("C://Users//pospi//IdeaProjects//Michal//src//main//resources//IMG_7441.tmp"));
                System.out.println("Successfuly saved image.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
