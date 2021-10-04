public class Musician {
    String name;
    int time;

    public Musician(String name, int time) {
        this.time = time;
        this.name = name;
        System.out.println(name + " on the stage");
    }

    public void solo() {
        System.out.println(name + " plays the Solo for " + time + " minutes");
    }

    public void play() {
        System.out.println(" " + name + " plays");
    }
}
