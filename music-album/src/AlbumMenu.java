import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import java.util.Scanner;

public class AlbumMenu {

	public static void main(String[] args) {
		AlbumDao albumDao = new AlbumDaoImpl();// Create an instance of the AlbumDao implementation
		Scanner scanner = new Scanner(System.in);// Create a scanner for user input
		while (true) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Add an album");
			System.out.println("2. List all albums");
			System.out.println("3. Find album by title");
			System.out.println("4. Find albums by artist");
			System.out.println("5. Find albums by genre");
			System.out.println("6. Update an album");
			System.out.println("7. Delete an album");
			System.out.println("8. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			switch (choice) {
			case 1:
				// Input album details and persist
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/albums.txt"))) {
					Scanner scanner1 = new Scanner(System.in);

					System.out.println("Enter album details:");
					System.out.print("Title: ");
					String title = scanner1.nextLine();
					writer.write(title);

					System.out.print("Artist: ");
					String artist = scanner1.nextLine();
					writer.write("," + artist);

					System.out.print("Genre: ");
					String genre = scanner1.nextLine();
					writer.write("," + genre);

					Album newAlbum = new Album(title, artist, genre);
					albumDao.persist(newAlbum);
					System.out.println("Album added successfully.");
				} catch (IOException e) {
					System.err.println("Error writing to file: " + e.getMessage());
				}

				break;

			case 2:
				// List all albums
				System.out.println("\nAll Albums:");
				String path = "src/albums.txt";
				BufferedReader reader = null;
				String line = null;

				try {
					FileReader fr = new FileReader(path); // opening file stream
					reader = new BufferedReader(fr); // Wrapping buffer around it

					while (true) {
						line = reader.readLine(); // Reads a line from buffer
						if (line == null) // EOF
							break;
						System.out.println(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (reader != null)
							reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					List<Album> allAlbums = albumDao.list();
					for (Album album : allAlbums) {
						System.out.println(album);
					}
				}
				break;

			case 3:
				// Find an album by title
				System.out.print("Enter title to find an album: ");
				String findTitle = scanner.nextLine();
				try {
					Album foundAlbum = albumDao.findByTitle(findTitle);
					System.out.println("Found Album: " + foundAlbum);
				} catch (InvalidAlbumException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 4:
				// Find albums by artist
				System.out.print("Enter artist to find albums: ");
				String findArtist = scanner.nextLine();
				List<Album> albumsByArtist = albumDao.findByArtist(findArtist);
				System.out.println("Albums by " + findArtist + ":");
				for (Album album : albumsByArtist) {
					System.out.println(album);
				}
				break;
			case 5:
				// Find albums by genre
				System.out.print("Enter genre to find albums: ");
				String findGenre = scanner.nextLine();
				List<Album> albumsByGenre = albumDao.findByGenre(findGenre);
				System.out.println("Albums in " + findGenre + " genre:");
				for (Album album : albumsByGenre) {
					System.out.println(album);
				}
				break;
			case 6:
				// Update an album
				System.out.print("Enter title of the album to update: ");
				String updateTitle = scanner.nextLine();

				System.out.print("Updated Title: ");
				String updatedTitle = scanner.nextLine();
				System.out.print("Updated Artist: ");
				String updatedArtist = scanner.nextLine();
				System.out.print("Updated Genre: ");
				String updatedGenre = scanner.nextLine();
				Album updatedAlbum = new Album(updatedTitle, updatedArtist, updatedGenre);
				boolean isUpdated = albumDao.update(updatedAlbum);
				if (isUpdated) {
					System.out.println("Album updated successfully.");
				} else {
					System.out.println("Album not found for update.");
				}

				break;

			case 7:
				// Delete an album by title
				System.out.print("Enter title to delete an album: ");
				String deleteTitle = scanner.nextLine();

				try {

					boolean isDeleted = albumDao.delete(deleteTitle);
					if (isDeleted) {
						System.out.println("Album deleted successfully.");
					} else {
						System.out.println("Album not found for deletion.");
					}

				} catch (InvalidAlbumException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 8:
				// Exit the program

				System.out.println("Exiting the program.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please choose a valid option.");
			}
		}
	}
}
