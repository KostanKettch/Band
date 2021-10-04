public class Drummer extends Musician {

    public static String scream = "Badabum badum tish";

    public Drummer(String name) {
        super(name + " the Drummer", 3);
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
