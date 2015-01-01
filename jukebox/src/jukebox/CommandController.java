package jukebox;

public class CommandController implements ICommandController {
	private IMusicPlayer musicPlayer;

	public CommandController(IMusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
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
		default:
			System.out.println("Command not recognised");
		}
	}
}
