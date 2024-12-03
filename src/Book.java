import java.util.Set;

public class Book {
    private int id;
    private String title;
    private Set<Chapter> chapters; // Relación con Chapter
    private Set<Movie> movies; // Relación con Movie

    public Book(int id, String title, Set<Chapter> chapters, Set<Movie> movies) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
