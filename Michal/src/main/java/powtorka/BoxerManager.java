package powtorka;

public class BoxerManager {
    public static void main(String[] args) {
        Boxer rocky = new Boxer("Rocky");
        rocky.setPunch(new LeftPunch());
        rocky.hitOpponent();
        rocky.setPunch(new RightPunch());
        rocky.hitOpponent();
    }
}
