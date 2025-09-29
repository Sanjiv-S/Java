public class Movie {
    private String title;
    private String genre;
    private int durationMinutes;

    public Movie(String title, String genre, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public String toString() {
        return "Title: " + title + " | Genre: " + genre + " | Duration: " + durationMinutes + " min";
    }
}