package quiz03;

public class Singer {

	//field
	private Song song;// private Song[] songs; 배열로 궁극적인 
	private String name;
	
	//constructor
	public Singer(String name) {
		this.name=name;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println(name);
		song.info();
	}
}
