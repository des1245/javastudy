package quiz08;

public class Singer {
	
	//field
	private String name;
	private Song[] songs;
	private int idx;
	
	//constructor
	public Singer(String name,int songCount) {
		//송카운트 노래갯수를 지정하는 방식 최대 10개를 가질수있는것
		this.name = name;
		this.songs =new Song[songCount];
	}
	//method
	public void addSong(Song song) { 
		if(idx<songs.length) {
		songs[idx++]=song;//최대 송카운트 가진 갯수
		//addSsong()호출마다 idx 증가하므로, idx는 추가된 노래의 개수입니다.
		}else {
			
			
			System.out.println("더 이상 노래를 추가할 수 없습니다.");
		}
	}
	public void info() {
		//가수명, 노래목록
		System.out.println("가수명:"+name);
		System.out.println("===노래 목록===");
		/*
		for(int i=0; i<songs.length; i++) {
			
			 // 3개에 정리해둔게 7개남은것 그것을 위해 if문을 사용한다.
			 
			if(songs[i]!=null) { //정보를 볼때만 널이 아닌경우 보여주겠다.
			songs[i].info();//송쪽에 구현 해둔 상태
			//null.inf(); -> NULLPointerEXCEPTION이러한 발생이 생긴다.
			//널이 있지도 않은넘이 메서드 넘어가주지 않는다.
			}
		}
		*/
		for(int i=0; i<idx; i++) {
			songs[i].info(); //
		
		}
	}
}
