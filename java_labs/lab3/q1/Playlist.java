public class Playlist {
    private String name;
    private double rating;
    private int numberOfSongs;

    // Constructor -- initializes name, rating, number of songs
    public Playlist(String name, double rating, int numberOfSongs) {
        this.name = name;
        this.rating = rating;
        this.numberOfSongs = numberOfSongs;
    }

    // Removes songs by the given parameter
    public void removeSong(int num) {
        numberOfSongs -= num;
    }

    // Increases song number by the given parameter
    public void addSong(int num) {
        numberOfSongs += num;
    }

    // Returns a string containing the name, number of songs, and rating
    public String toString() {
        return "Playlist " + name + " has " + numberOfSongs + " songs and the playlist rating is " + rating + ".";
    }

    // Change the rating of the playlist by the given parameter
    public void changeRating(double rating) {
        this.rating += rating;
    }
}
