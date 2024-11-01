package demo;
import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist = new LinkedList<>();

    public void addSong(String song) {
        playlist.add(song);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found.");
        }
    }

    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < playlist.size() && toIndex >= 0 && toIndex < playlist.size()) {
            String song = playlist.remove(fromIndex);
            playlist.add(toIndex, song);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public void displayPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }

    public static void main(String[] args) {
        MusicPlaylist mp = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Song\n2. Remove Song\n3. Move Song\n4. Display Playlist\n5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter song name:");
                    String song = scanner.nextLine();
                    mp.addSong(song);
                    break;
                case 2:
                    System.out.println("Enter song name to remove:");
                    String songToRemove = scanner.nextLine();
                    mp.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.println("Enter current index of the song:");
                    int fromIndex = scanner.nextInt() - 1;
                    System.out.println("Enter new index for the song:");
                    int toIndex = scanner.nextInt() - 1;
                    mp.moveSong(fromIndex, toIndex);
                    break;
                case 4:
                    mp.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
