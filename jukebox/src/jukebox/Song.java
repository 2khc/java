package jukebox;

public class Song implements ISong {
	private String name;
	private String filePath;

	public Song(String name, String filePath) {
		this.name = name;
		this.filePath = filePath;
	}
	
	public String getSongName(){
		return this.name;
	}
}
