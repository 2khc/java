package jukebox;

import java.util.Scanner;

import maryb.player.Player;

public class Main {
	public static void main(String[] args) {
		// ILibrary library = new Library();
		// library.addSong();
		Player player = new Player();
		IOpenFileDialog openFileDialog = new OpenFileDialog();
		ISongQueue songQueue = new SongQueue(openFileDialog);
		IMusicPlayer musicPlayer = new MusicPlayer(player, openFileDialog, songQueue);
		ICommandController commandController = new CommandController(musicPlayer, songQueue);
		Scanner scanner = new Scanner(System.in);

	
		while (true) {
			String command = scanner.nextLine();
			commandController.decipherCommand(command);
		}

	}
}
