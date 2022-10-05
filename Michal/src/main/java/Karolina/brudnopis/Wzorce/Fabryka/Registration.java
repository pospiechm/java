package Karolina.brudnopis.Wzorce.Fabryka;

public abstract class Registration {
    private String number;
    private Language languale;
    private Size size;

    public Registration(String number, Language language, Size size) {
        this.number = number;
        this.languale = language;
        this.size = size;
    }

    public Registration(){};

    public String getNumber() {
        return number;
    }

    public Language getLanguale() {
        return languale;
    }

    public Size getSize() {
        return size;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLanguale(Language languale) {
        this.languale = languale;
    }

    public void setSize(Size size) {
        this.size = size;
    }

//    @Override
//    public String toString() {
//        return "Registration{" +
//                "number='" + number + '\'' +
//                ", languale=" + languale +
//                ", size=" + size +
//                           '}';
//    }
}
