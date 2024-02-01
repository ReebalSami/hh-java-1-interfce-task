package neuefisched.de;

public class MusicPlayer implements Playable {
    private String title;
    private String artist;
    private int year;
    private String genre;

    //Constructor:


    public MusicPlayer(String title, String artist, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }


    // Getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.printf("Now playing a %s called %s by %s from %d.", genre, title, artist, year);

    }
}
