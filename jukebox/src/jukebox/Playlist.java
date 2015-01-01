package jukebox;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IPlaylist {
	String name;
	List<ISong> playlist;

	public Playlist(String name) {
		this.name = name;
		this.playlist = new ArrayList<ISong>();
	}

	public void rename(String name) {
		this.name = name;
	}

	public void addSong(ISong song) {
		this.playlist.add(song);
	}

	public void removeSong(int index) {
		this.playlist.remove(index);
	}

	public void deletePlaylist() {
		this.playlist = null;
	}
}
