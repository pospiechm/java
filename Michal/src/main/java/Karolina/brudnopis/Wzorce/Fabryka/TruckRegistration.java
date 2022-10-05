package Karolina.brudnopis.Wzorce.Fabryka;

    public class TruckRegistration extends Registration{
        private boolean sticker;

        public TruckRegistration(String number, Language language, Size size, boolean sticker) {
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