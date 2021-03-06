package quiz07;

public class Game {

	//플레이어가 여러명 있을 수 있다.
	//field

	//비정상적인 방법
	//private Player[] player =new Player[playerCount];
	
	//1.정상적인 방법
	private Player[] player; //선언부분 -플레이어 클래스 겟터 세터 상관없이 플레이어들이 여러명이 저장된곳이다.
	
	//constructor
	public Game(int playerCount) { //분리된 선언
		player =new Player[playerCount];
	}	
	//method
	public void setPlayer() {
		String[] name = {"alice","david","brown","emily","james"};//초기화 선언을 줘서 임의로 지정
		for(int i=0; i<player.length; i++) {
			 //처리방법 1 player[i].setName(name); 플레이 생성자가 없을때 이러한 방식으로 처리하는방법
			player[i] =new Player(name[(int)(Math.random()*name.length)]); //똑같은 플레이어가 생길수도 있다는것
		
		}
	}
	public void play() { 
		//Player들의 Play() 결과를 저장할 int[] times
		int[] times = new int[player.length];
		
		for(int i=0; i<player.length; i++) {
			times[i] = player[i].play();
		}
		//times 배열에서 10과 가장 가까운 값을 찾는것
		//(time[i]-10) 10이랑 가깞다는건 절대값을 구한뒤 그중 가장 작은값을(최소값을) 구한다.
		//절대값 : Math.abs(n) n의 절대값
		//abs는 앱솔루트 넘버
		
		int min =Math.abs(times[0]-10); //첫번째 요소를 초기화 값으로 사용합니다.
		int winnerNo=0; //winnerNo=0 -> times[0]셋팅
		for(int i=1; i<times.length; i++) {
			if(min > Math.abs(times[i]-10)){//매스 abs절대값 넘버 최소값을 구하고자하는 대상
				min = Math.abs(times[i]-10);
				winnerNo=i;
			}
		}
		for(int i=0; i<player.length; i++) {
			System.out.println(player[i].getName()+"'s result:"+times[i]+"second");
		}
		System.out.println(player[winnerNo].getName()+"'s victory !");
	}
}
