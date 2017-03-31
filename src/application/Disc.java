package application;

public class Disc extends Element {
    private final int songsAmount;
    private final musicGenres genre;

    public int getSongsAmount() {
        return songsAmount;
    }

    public musicGenres getGenre() {
        return genre;
    }

    Disc(String author, int songsAmount, musicGenres genre) {
        super(author);
        this.songsAmount = songsAmount;
        this.genre = genre;
    }
}
