package jukebox;

import javax.swing.JFileChooser;

public class OpenFileDialog implements IOpenFileDialog {
	String fileDir;

	public OpenFileDialog() {

	}

	public String getFileURI() {
		JFileChooser fc = new JFileChooser();

		int returnVal = fc.showOpenDialog(fc);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			// name = fc.getSelectedFile().getName();
			fileDir = fc.getSelectedFile().getPath();
			fileDir = correctURI(fileDir);
			System.out.println("You chose to open: " + fc.getSelectedFile().getName());
		}
		return fileDir;
	}

	private String correctURI(String uri) {
		String str = uri.replace("\\", "/");
		str = uri.replace("\\", "/");
		return str;
	}
}
