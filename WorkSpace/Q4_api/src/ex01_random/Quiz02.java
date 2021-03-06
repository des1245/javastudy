package ex01_random;

import java.util.Scanner;

//2.UpDown게임
//1~10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞히는 게임
//입력 >>> 5000
//Up
//입력 >>>7500
//Down
//입력 >>> 7499
//정답. 총 3번만에 정답

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int top =10000;
		int bottom = 1;
		//int rand =(int)(Math.random()*10000)+1;//난수 발생
		int rand =(int)(Math.random()*top)+bottom;
		int n=0; //사용자 입력 값
		int times =0; //입력 횟수
		
		do {
			// 입력 받습니다.
			System.out.println("입력 >>>");
			n = sc.nextInt();
			times++; //입력 받았으면 무조건 증가해줘야한다.
			//입력 범위 체크
			if(n>top || n<bottom) { //n이 탑보다 크거나 아니면 n이 버튼보다 숫자가 크게 했다.
				System.out.println(bottom+"~"+times+"범위를 입력하세요.");
				continue;// 컨틴뉴는 이프 아래 시작안하고 do로 해서 루프를 돌것이다.
			}
			//비교합니다.
			if(n==rand) { //n이 탑보다 크거나 아니면 n이 버튼보다 숫자가 크게 했다.
				System.out.println("총"+times+"번만에 정답입니다.");
				//
			}else if (n<rand) {
				System.out.println("Up");
				bottom =n+1; //받은 입력값 5000에서부터 10000인데 10001이 되는것 이다.
			}else {
				System.out.println("Down");
				top=n-1; //5001~7499 
			}
			
		}while(rand !=n);
		sc.close();
	}
}
