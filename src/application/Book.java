package application;

public class Book extends Element {
    private final String publisher;
    private final int pagesAmount;

    public Book(String author, int pagesAmount, String publisher) {
        super(author);
        this.pagesAmount = pagesAmount;
        this.publisher = publisher;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public String getPublisher() {
        return publisher;
    }
}
