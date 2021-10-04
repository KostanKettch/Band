public class Vocalist extends Musician {

    public static String scream = "Lalalalay";

    public Vocalist(String name) {
        super(name + " the Vocalist", 1);
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
