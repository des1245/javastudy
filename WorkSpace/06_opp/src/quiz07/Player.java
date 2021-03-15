package quiz07;

import java.util.Scanner;

public class Player {
	
	//field
	private String name;
	private Scanner sc =new Scanner(System.in);
	
	//construct
	public Player(String name) {
		this.name =name;
	}
	//method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int play() { //몇초 경과되었다. 플레이 했을때
	System.out.println(name+"'s game start!"); 
	System.out.println("Press Enter!"); //엔터쓰겠다면 스캐너 필요
	// Enter입력: nextLine(); 엔터만 입력받아서 엔터를 어디에 저장하는것두 아니다.
	sc.nextLine();
	long start =System.currentTimeMillis(); //첫 엔터 시간 엔터눌렀을때 시작을 스타트에 젠다.
	System.out.println("After 10seconds Press Enter!");
	sc.nextLine();
	long end =System.currentTimeMillis(); //두번재 엔터 시간
	//경과 시간반환
	return (int)((end-start)/1000); //()안에 둘다 롱타입이라 연산먼저 시키기 그래서 (())우선순위 연산결과
	
	}
}
