package jukebox;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Library implements ILibrary {
	List<ISong> library = new ArrayList<ISong>();
	String name;
	String fileDir;

	public Library() {

	}

	public void addSong() {
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("mp3", "flac");
		fc.setFileFilter(filter);
		int returnVal = fc.showOpenDialog(fc);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			name = new String(fc.getSelectedFile().getName());
			fileDir = fc.getSelectedFile().getPath();
			System.out.println("You chose to open: " + fc.getSelectedFile().getName());
		}

		ISong song = new Song(name, fileDir);
		library.add(song);
	}

	public void watchFolder() {

	}

	public void removeSong() {

	}

}
