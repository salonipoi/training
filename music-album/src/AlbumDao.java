import java.util.List;

public interface AlbumDao {

	void persist(Album a) throws InvalidAlbumException;

	Album findByTitle(String title) throws InvalidAlbumException;

	List<Album> list();

	List<Album> findByArtist(String artist);

	List<Album> findByGenre(String genre);

	boolean update(Album a);

	boolean delete(String title) throws InvalidAlbumException;

}
