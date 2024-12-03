public class Chapter {
    private int id;
    private String chapterName;
    private Book book; // Relación con Book

    public Chapter(int id, String chapterName, Book book) {
        this.id = id;
        this.chapterName = chapterName;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
