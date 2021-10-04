public class Performance {
    final static private int MAX = 4;
    private Musician[] musicians;
    private int i = 0;

    Performance() {
        musicians = new Musician[MAX];
    }


    public void add(Musician m) {
        if (i >= MAX) System.out.println("No more musicians in the band!");
        else musicians[i++] = m;
    }

    public void start(String bandname) {
        System.out.println(bandname+" on the stage! Let's ROCK!");
        run();
    }

    public void run() {
        // Используем цикл!
        for (int j = 0; j < i; j++) {
            if (musicians[j] != null) musicians[j].solo();
        }
    }
}
