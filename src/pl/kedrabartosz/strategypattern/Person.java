package pl.kedrabartosz.strategypattern;

public class Person {
    private ReadingSpeed readingSpeed;

    public Person(ReadingSpeed readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    public void setReadingSpeed(ReadingSpeed readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    public void readBook(String book) {
        readingSpeed.read(book);
    }
}
