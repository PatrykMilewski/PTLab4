package application;

public class Movie extends Element {
    private final String staff;
    private final int duration;

    public Movie(String author, String staff, int duration) {
        super(author);
        this.staff = staff;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getStaff() {
        return staff;
    }
}
