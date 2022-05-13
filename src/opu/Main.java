package opu;

public class Main {

    /**
     * Поля класса
     *
     * Исполнитель
     * Жанр
     * Название альбома
     * Тираж
     *
     *
     * Задача
     *
     *Вывести данные о пластинках, тираж которых
     * превышает 10000 экземпляров.
     */

    public static void main(String[] args) {
        Album Help = new Album("The Beatles", "Rock-n-Roll, Rock", "Help!", 12000);
        Album QueenII = new Album("The Queen", "Hard rock", "Queen II", 1000);
        Album aStarNamedSun = new Album("Viktor Coi", "Rock", "A star named Sun", 8000);
        final Albums albums = new Albums(3);
        albums.addAlbum(Help);
        albums.addAlbum(QueenII);
        albums.addAlbum(aStarNamedSun);
        albums.editionTo10();
    }
}