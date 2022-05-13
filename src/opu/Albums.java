package opu;

public class Albums {
    private Album[] albums;

    int currentAlbumsNumber;

    public Albums(final int numberAlbums){
        this.albums = new Album[numberAlbums];
        currentAlbumsNumber = -1;
    }

    public void addAlbum(final Album album){
        currentAlbumsNumber++;
        albums[currentAlbumsNumber] = album;
    }

    public void editionTo10(){
        for (int i = 0; i <= currentAlbumsNumber; ++i){
            if (albums[i].getEdition() > 10000) {
                System.out.println("The album witch edition > 10 000 " + albums[i]);
            }

        }
    }
}
