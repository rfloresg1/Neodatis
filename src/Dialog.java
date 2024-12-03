public class Dialog {
    private int id;
    private String dialog;
    private Movie movie; // Relación con Movie
    private Character character; // Relación con Character

    public Dialog(int id, String dialog, Movie movie, Character character) {
        this.id = id;
        this.dialog = dialog;
        this.movie = movie;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
