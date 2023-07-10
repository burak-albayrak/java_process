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
    public int removeSong(int num) {
        numberOfSongs -= num;
        return numberOfSongs;
    }

    // Increases song number by the given parameter
    public int addSong(int num) {
        numberOfSongs += num;
        return numberOfSongs;
    }

    // Returns a string containing the name, number of songs, and rating
    public String toString() {
        return "Playlist " + name + " has " + numberOfSongs + " songs and the playlist rating is " + rating + ".";
    }

    // Change the rating of the playlist by the given parameter
    public double changeRating(double rating) {
        this.rating += rating;
        return this.rating;
    }
}
