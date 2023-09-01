import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albumList = new ArrayList<>();

	@Override
	public void persist(Album album) {
		albumList.add(album);
	}

	@Override
	public Album findByTitle(String title) throws InvalidAlbumException {
		for (Album album : albumList) {
			if (album.getTitle().equals(title)) {
				return album;
			}
		}
		throw new InvalidAlbumException("Album not found with title: " + title);

	}

	@Override
	public List<Album> list() {
		return albumList;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		List<Album> result = new ArrayList<>();
		for (Album album : albumList) {
			if (album.getArtist().equals(artist)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public List<Album> findByGenre(String genre) {
		List<Album> result = new ArrayList<>();
		for (Album album : albumList) {
			if (album.getGenre().equals(genre)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public boolean update(Album album) {
		for (int i = 0; i < albumList.size(); i++) {
			if (albumList.get(i).getTitle().equals(album.getTitle())) {
				albumList.set(i, album);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		for (int i = 0; i < albumList.size(); i++) {
			if (albumList.get(i).getTitle().equals(title)) {
				albumList.remove(i);
				return true;
			}
		}
		throw new InvalidAlbumException("Album not found with title: " + title);
	}
}
