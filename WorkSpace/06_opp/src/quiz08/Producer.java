package quiz08;

public class Producer {
	
	//method
	public void produce(Singer singer,Song song) { //어떤 가수에게 노래를 만들어주겠다는것
		singer.addSong(song); 
	}
}
