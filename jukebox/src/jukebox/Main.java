package jukebox;

import java.util.Scanner;

import maryb.player.Player;

public class Main {
	public static void main(String[] args) {
		// ILibrary library = new Library();
		// library.addSong();
		Player player = new Player();
		IOpenFileDialog openFileDialog = new OpenFileDialog();
		IMusicPlayer musicPlayer = new MusicPlayer(player, openFileDialog);
		ICommandController commandController = new CommandController(musicPlayer);
		Scanner scanner = new Scanner(System.in);

		// player.playSongFromFile();
		while (true) {
			System.out.println("Welcome to broken shit");
			String command = scanner.nextLine();
			commandController.decipherCommand(command);
		}

	}
}
