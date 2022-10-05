package InterfejsyFunkcjonalne.imageEditor;

public class Main {
    public static void main(String[] args) {
        ImageEditor i = new ImageEditor();
        i.loadImage("IMG_7441.jpg");
        i.perform(new DrawRectangle());
        i.perform(new DrawSomething());
        i.perform(new DrawText());
        i.saveImage();
    }


}
