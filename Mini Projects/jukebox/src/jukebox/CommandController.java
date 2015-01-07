package jukebox;

public class CommandController implements ICommandController {
	private IMusicPlayer musicPlayer;
	private ISongQueue songQueue;

	public CommandController(IMusicPlayer musicPlayer, ISongQueue songQueue) {
		this.musicPlayer = musicPlayer;
		this.songQueue = songQueue;
	}

	public void decipherCommand(String str) {
		switch (str) {
		case "chooseSong":
			this.musicPlayer.playSongFromFile();
			break;
		case "stop":
			this.musicPlayer.stopSong();
			break;
		case "pause":
			this.musicPlayer.pauseSong();
			break;
		case "play":
			this.musicPlayer.playSong();
			break;
		case "next":
			this.musicPlayer.nextSong();
			break;
		case "addSong":
			this.songQueue.addSong();
			break;
		default:
			System.out.println("Command not recognised");
		}
	}
}
