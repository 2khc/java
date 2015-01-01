package jukebox;

import maryb.player.Player;

public class MusicPlayer implements IMusicPlayer {
	ISong currentSong;
	String name;
	String fileDir;
	Player musicPlayer;
	IOpenFileDialog openFileDialog;

	public MusicPlayer(Player musicPlayer, IOpenFileDialog openFileDialog) {
		this.musicPlayer = new Player();
		this.openFileDialog = openFileDialog;
	}

	public void playSongFromFile() {
		fileDir = openFileDialog.getFileURI();
		musicPlayer.setCurrentVolume(0.7f);
		musicPlayer.setSourceLocation(fileDir);
		musicPlayer.play();
	}

	public void playSong() {
		this.musicPlayer.play();
	}

	public void nextSong() {

	}

	public void pauseSong() {
		this.musicPlayer.pause();
	}

	public void stopSong() {
		this.musicPlayer.stop();
	}

	public void previousSong() {

	}
}
