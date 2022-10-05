package Karolina.brudnopis.Wzorce.Fabryka;

public class MotorcycleRegistration extends Registration{
    private boolean sticker;

    public MotorcycleRegistration(String number, Language language, Size size, boolean sticker) {
        super(number, language, size);
        this.sticker = sticker;
    }

    public boolean isSticker() {
        return sticker;
    }

    public void setSticker(boolean sticker) {
        this.sticker = sticker;
    }

    @Override
    public String toString() {
        return "MotorcycleRegistration{" +
                "number=" + getNumber() +
                "size=" + getSize() +
                "Language=" + getLanguale() +
                "sticker=" + sticker +
                '}';
    }
}