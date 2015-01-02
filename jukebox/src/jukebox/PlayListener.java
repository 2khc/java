package jukebox;

import maryb.player.PlayerEventListener;

public class PlayListener implements PlayerEventListener {
	private IMusicPlayer musicPlayer;
	
	public PlayListener(IMusicPlayer player) {
		this.musicPlayer = player;
	}

	@Override
	public void buffer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void endOfMedia() {
		// TODO Auto-generated method stub
		this.musicPlayer.nextSong();
		System.out.println("Finished song");
	}

	@Override
	public void stateChanged() {
		// TODO Auto-generated method stub

	}

}
