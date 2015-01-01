package jukebox;

import java.util.LinkedList;
import java.util.Queue;

public class SongQueue implements ISongQueue {
	private Queue<ISong> queue;

	public SongQueue() {
		queue = new LinkedList<ISong>();
	}

	public void loadPlaylist() {

	}

	public void addSong(ISong song) {
		queue.add(song);
	}

	

}
