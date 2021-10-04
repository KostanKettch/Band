public class Guitarist extends Musician {

    public static String scream = "Bow bow chika wowow";

    public Guitarist(String name) {
        super(name + " the Guitarist", 5);
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
