package jukebox;

import maryb.player.Player;
import maryb.player.PlayerEventListener;
import maryb.player.PlayerState;

public class MusicPlayer implements IMusicPlayer {
	ISong currentSong;
	String name;
	String fileDir;
	Player player;
	IOpenFileDialog openFileDialog;
	ISongQueue songQueue;

	public MusicPlayer(Player musicPlayer, IOpenFileDialog openFileDialog, ISongQueue songQueue) {
		this.player = new Player();
		this.openFileDialog = openFileDialog;
		this.songQueue = songQueue;
		PlayerEventListener pel = new PlayListener(this);
		this.player.setListener(pel);
	}

	public void playSongFromFile() {
		fileDir = openFileDialog.getFileURI();
		player.setCurrentVolume(0.7f);
		player.setSourceLocation(fileDir);
		player.play();
	}

	public void playSong() {
		if (player.getState() == PlayerState.PAUSED) {
			this.player.play();
		} else {
			player.setSourceLocation(songQueue.getTopSong());
			this.player.play();
		}
	}

	public void nextSong() {
		player.setSourceLocation(songQueue.getTopSong());
		player.play();
	}

	public void pauseSong() {
		this.player.pause();
		System.out.println(player.getState());
	}

	public void stopSong() {
		this.player.stop();
	}

	public void previousSong() {

	}
}
