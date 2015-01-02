package jukebox;

import java.util.LinkedList;
import java.util.Queue;

public class SongQueue implements ISongQueue {
	private Queue<String> queue;
	IOpenFileDialog openFileDialog;

	public SongQueue(IOpenFileDialog openFileDialog) {
		this.queue = new LinkedList<String>();
		this.openFileDialog = openFileDialog;
	}

	public void addSong() {
		String fileDir = openFileDialog.getFileURI();
		this.queue.add(fileDir);
	}

	public String getTopSong() {
		return this.queue.remove();
	}

	public void loadPlaylist() {

	}

}
