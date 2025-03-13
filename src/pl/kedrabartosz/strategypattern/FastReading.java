package pl.kedrabartosz.strategypattern;

public class FastReading implements ReadingSpeed {
    public void read(String book) {
        System.out.println("Reading " + book + " very fast! :)))");
    }
}
