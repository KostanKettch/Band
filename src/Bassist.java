public class Bassist extends Musician {

    public static String scream = "Thumm Thumm Thuthummmm";

    public Bassist(String name) {
        super(name + " the Bassist", 3);
    }

    @Override
    public void play() {
        play(false);
    }

    public void play(boolean loud){
        if (loud) System.out.print(scream.toUpperCase());
        else System.out.print(scream);
        super.play();
    }

    @Override
    public void solo() {
        super.solo();
        play();
    }
}
