package jukebox;

public interface ILibrary {
	void addSong();

	ISong getSong(String name);

	void watchFolder();

	void removeSong();
}
