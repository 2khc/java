package jukebox;

import java.util.LinkedList;
import java.util.Queue;

public class SongQueue implements ISongQueue {
	private Queue<ISong> queue;
	IOpenFileDialog openFileDialog;

	public SongQueue(IOpenFileDialog openFileDialog) {
		this.queue = new LinkedList<ISong>();
		this.openFileDialog = openFileDialog;
	}
	
	public void addSong(){
		String fileDir = openFileDialog.getFileURI();
		//this.queue.add(song);
	}
	
	
	public void loadPlaylist() {
		
	}

}
