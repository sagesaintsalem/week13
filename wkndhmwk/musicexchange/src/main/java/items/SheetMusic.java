package items;


import Enums.Genre;

public class SheetMusic extends MusicItem {

    private String title;
    private Genre genre;

    public SheetMusic(double boughtPrice, double sellingPrice, String title, Genre genre) {
        super(boughtPrice, sellingPrice);
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
