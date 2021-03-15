package ex01_branch;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점:");
		int score = sc.nextInt();
		
		char point ='-';
		switch(score%10) {
		case 9: case 8: case 7:
			point ='+';
		case 6: case 5: case 4:
			point ='0';
		}
		char grade ='F';
		switch(score/10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			point=' ';
		}
		System.out.println(""+grade+point); //첫번째 스트링
		System.out.println(grade+""+point); //두번째 스트링
		System.out.println(grade+point+""); //아스키코드표 보면 계산 결과 합이 다르다.
		System.out.println(grade+point);
		
		sc.close();
	
		/*
		int choice = 1;
		
		switch(choice) {
		case 1:
			System.out.println("1이다.");
			break; //switch문을 종료합니다.
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("1과 2가 아니다.");
			//디폴트에는 브레이크는 않넣는게 좋다. 위에 브레이크가 있고 그래서 불필요하고
			//또한 브레이크를 사용안하면 초이스1에서 케이스1을 실행하면 출력결과1이다 끝나야하는데
			//브레이크 없어서 2이다 랑 1과2가 아니다. 라는거 까지같이 실행 돼버린다.
			//브레이크를 안넣고 처리하는 방법도 있긴하다 나중에 배울때 이긴 하지만
		
		}
		*/
		
	}
}
