package jukebox;

import java.util.Hashtable;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Library implements ILibrary {
	Hashtable<String, ISong> library = new Hashtable<String, ISong>();
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
			fileDir = correctURI(fileDir);
			System.out.println("You chose to open: " + fc.getSelectedFile().getName());
		}
		ISong song = new Song(name, fileDir);

		library.put(name, song);
		System.out.println(library.get(name).toString() + " <--- value obtained by library.get");

	}
	
	private String correctURI(String uri) {
		String str = uri.replace("\\", "/");
		str = uri.replace("\\", "/");
		return str;
	}
	

	public ISong getSong(String name) {
		return library.get(name);
	}

	public void watchFolder() {

	}

	public void removeSong() {

	}

}
