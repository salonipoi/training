import java.util.Optional;
import java.util.Scanner;

public class AlbumMenu {
	private static AlbumDaoImpl dao;
	static {
		try {
			dao = new AlbumDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InvalidAlbumException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Main Menu");
			System.out.println(
					"1- Add \n2- Find by Title\n3- List\n4- Find by Artist\n5- Find by Genre\n6- Update\n7- Delete");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				addpersist();
				break;
			case 2:
				findbytitle();
				break;
			case 3:
				list();
				break;
			case 4:
				findbyartist();
				break; 
			case 5:
				findbygenre();
				break;
			case 6:
				update();
				break;
			case 7:
				delete();
				break;
			}
		}
	}

	private static void list() {
		dao.list().forEach(System.out::println);
	}

	private static void delete() throws InvalidAlbumException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album to Delete: ");
		String delete = sc.next();
		System.out.println(dao.delete(delete));
	}

	//private static void update() {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Update Existing Albums: ");
		// String update = sc.next();
		// Album a = new Album(update);
		// dao.update(a);
		
		

		private static void update() {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter album title to update: ");
		    String u_Title = scanner.nextLine();
		    try {
		        Album foundAlbum = dao.findByTitle(u_Title);
		        System.out.print("Enter new artist (or press Enter to keep current artist name): ");
		        String n_Artist = scanner.nextLine();
		        System.out.print("Enter new genre (or press Enter to keep current genre name): ");
		        String n_Genre = scanner.nextLine();		
		        // Check if either artist or genre needs to be update
		        if (!n_Artist.isEmpty() || !n_Genre.isEmpty()) {
		            if (!n_Artist.isEmpty()) {
		                foundAlbum.setArtist(n_Artist);
		            }
		            if (!n_Genre.isEmpty()) {
		                foundAlbum.setGenre(n_Genre);
		            }		 
		            dao.update(foundAlbum);
		            System.out.println("Album updated successfully!!!");
		        } 
		        else {
		            System.out.println("No changes made to the album.");
		        }
		    } catch (InvalidAlbumException e) {
		        System.out.println(e.getMessage());
		    }
		}
	
	
	private static void findbygenre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Genre: ");
		String genre = sc.next();
		System.out.println(dao.findByGenre(genre));
	}

	private static void findbyartist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Artist: ");
		String artist = sc.next();
		System.out.println(dao.findByArtist(artist));
	}

	private static void findbytitle() throws InvalidAlbumException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title: ");
		String title = sc.nextLine();
		System.out.println(dao.findByTitle(title));
	}

	private static void addpersist() throws InvalidAlbumException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title: ");
		String title = sc.next();
		System.out.println("Enter Artist: ");
		String artist = sc.next();
		System.out.println("Enter Genre: ");
		String genre = sc.next();
		Album a = new Album(title, artist, genre);

		dao.persist(a);
	}
}