package Karolina.brudnopis.Wzorce.Fabryka;

public class CarRegistration extends Registration{
    private boolean sticker;

    public CarRegistration(String number, Language language, Size size, boolean sticker) {
        super(number, language, size);
        this.sticker = sticker;
    }

    public boolean isSticker() {
        return sticker;
    }

    public void setSticker(boolean sticker) {
        this.sticker = sticker;
    }

}
