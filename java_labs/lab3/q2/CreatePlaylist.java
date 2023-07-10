import java.util.Scanner;

public class CreatePlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of playlists: ");
        int numberOfPlaylists = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Playlist[] playlists = new Playlist[numberOfPlaylists];

        for (int i = 0; i < numberOfPlaylists; i++) {
            System.out.println("Playlist number " + (i + 1) + ":");

            System.out.print("Playlist name: ");
            String name = scanner.nextLine();

            System.out.print("Playlist rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Number of songs in the playlist: ");
            int numberOfSongs = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            playlists[i] = new Playlist(name, rating, numberOfSongs);
        }

        System.out.println();

        // Remove 50 songs from the ROCK playlist
        playlists[0].removeSong(50);

        // Print ROCK playlist's current number of songs
        System.out.println("Current number of songs: " + playlists[0].toString());

        // Add 100 songs to the POP playlist
        playlists[1].addSong(100);

        // Print POP playlist's current number of songs
        System.out.println("Current number of songs: " + playlists[1].toString());

        // Decrease RAP's rating by 0.3
        playlists[2].changeRating(-0.3);

        // Increase ROCK's rating by 0.7
        playlists[0].changeRating(0.7);

        // Print the summary for all playlists
        for (Playlist playlist : playlists) {
            System.out.println(playlist.toString());
        }

        scanner.close();
    }
}
