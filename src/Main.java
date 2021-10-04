public class Main {
    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.add(new Guitarist("Brian"));
        performance.add(new Bassist("John"));
        performance.add(new Drummer("Roger"));
        performance.add(new Vocalist("Freddy"));

        performance.add(new Bassist("Noname"));

        performance.start("Queen");


    }

}


