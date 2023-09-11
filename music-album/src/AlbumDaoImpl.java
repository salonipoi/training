import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albums;private List<Album> albumList = new ArrayList<>();
	

	public AlbumDaoImpl() throws Exception {
		albums = new ArrayList<Album>();
		Stream<String> lines = Files.lines(Paths.get("src/albums.txt"));

		albums = lines.map(line -> {
			String[] record = line.split(",");
			return new Album(record[0], record[1], record[2]);
		}).collect(Collectors.toList());
	}

	@Override
	public void persist(Album a) throws InvalidAlbumException {
		// albums.add(a);
		boolean exists = albums.stream().anyMatch(album -> album.getTitle().equalsIgnoreCase(a.getTitle()));
		if (exists) {
			throw new InvalidAlbumException("An album with the same title already exists: " + a.getTitle());
		} else {
			albums.add(a);
		}
	}

	@Override
	public Album findByTitle(String title) throws InvalidAlbumException {
		return albums.stream().filter(f -> f.getTitle().equalsIgnoreCase(title)).findFirst()
				.orElseThrow(() -> new InvalidAlbumException("No Album found with the title name:" + title));
	
	}

	@Override
	public List<Album> list() {

		return albums;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		return albums.stream().filter(f -> f.getArtist().equalsIgnoreCase(artist)).toList();
	}

	@Override
	public List<Album> findByGenre(String genre) {

		return albums.stream().filter(f -> f.getGenre().equalsIgnoreCase(genre)).toList();
	}

	@Override
	public boolean update(Album a) {
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		return albums.removeIf(f -> f.getTitle().equalsIgnoreCase(title));

	}

}