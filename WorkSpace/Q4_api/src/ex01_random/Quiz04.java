package ex01_random;

import java.util.Scanner;

//4.가위바위보
//가위바위보 >>> 가위
//player는 가위,computer는 보, 이겼습니다.
//언제까지? 질때까지 또 물어보면서 가위바위 보>>> 바위
//player는 바위, computer는 바위, 비겼습니다.
//가위바위보 >>> 보
//playter는 보, computer는 가위, 졌습니다.
//1승 1무 입니다. 이긴것과 비긴것을 나오면돼고 지면 종료하면된다.

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String[] gababo = {"가위","바위","보"};
		
		int win =0; //이긴 횟수
		int draw =0; //비긴 횟수
		
		loop: //라벨값 루프 와일 구문 에서 종료를 시켜주고 싶을때 
			//루프로 브레이크 하지만 이러한 많이 사용하는것 비추천이라고한다. 강사님께서
		while(true) {
			System.out.println("가위바위 보>>>");
			int player =0; //초기화로 가위
			switch(sc.next()) { //가위 이면 값을 안받겠다는 의미
			case "바위"://플레이어가 바위로 바끼게 되는것
				player =1;
			case "보":
				player =2;
			}
			System.out.println("player는" + gababo[player]);
			
			int computer =(int)(Math.random()*3)+0; //gababo 배열의 인덱스
			System.out.println(",computer"+gababo[computer]);
			
			//player : 0,1,2
			//computer : 0,1,2
			
			//diff =player - computer
			//1.이긴 경우: diff= -2,1
			//2.비긴 경우: diff= 0
			//3.진 경우   : diff= 나머지(이 외의 값)
			switch(player -computer) { //값이 안받아져서 0-보는 인덱스로 2로 해서 -2로 이겼다는것으로 나온것
			case -2: case -1:
				System.out.println(", 이겼습니다.");
				break;
			case 0:
				System.out.println(", 비겼습니다.");
				break;
			default:
				System.out.println(", 졌습니다.");
				break loop;
			}
		}
		System.out.println(win+"승"+draw+"무");
		sc.close();
		/*
		Scanner sc =new Scanner(System.in);
		String[] gababo = {"가위","바위","보"};
		while(true) {
			int computer =(int)(Math.random()*3)+0; 
			//0~3까지 중하나 랜덤으로 인덱스 해당데이터를 빼내는것
			System.out.println(gababo[computer]);
			
			if(0<computer) {
				System.out.println("player"+gababo[computer]+"computer"+gababo[computer]+",이겼습니다.");
				break;
			}else{
				System.out.println("player"+gababo[computer]+",비겼습니다.");
			}	
		}
		sc.close();
		*/
	}
}
