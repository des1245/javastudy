package quiz03;

public class Song {
	
	//field
	private String title;
	private double playTime;
	
	//constructor
	public Song(String title, double playTime) {
		this.title= title;
		this.playTime=playTime;
	}
	//method
	public void info() {
		System.out.println("title:"+title+"재생률시간:"+playTime);
	}
}
