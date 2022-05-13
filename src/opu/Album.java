package opu;

public class Album {
    private String artist;

    public void setArtist(final String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    private String genre;

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    private String nameAlbum;

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(final String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    private int edition;

    public void setEdition(final int edition) {
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public Album(final String artist, final String genre, final String nameAlbum, final  int edition){
        this.setArtist(artist);
        this.setGenre(genre);
        this.setNameAlbum(nameAlbum);
        this.setEdition(edition);
    }

    @Override
    public String toString() {
        return "Album: " +
                "artist -  " + artist + '\'' +
                ", genre - " + genre + '\'' +
                ", name of album - " + nameAlbum + '\'' +
                ", edition - " + edition;
    }
}
