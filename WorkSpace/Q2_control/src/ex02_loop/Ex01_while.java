package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		//무한루프 만들기
		/*
		while(true) {
			System.out.println("무한루프 입니다."); //여러번 수행하는것을 반복문
		}
		*/
		/*
		//데이터베이스가서 몇개 프로그램 구현하면 된다. 그때 써먹을 가능성이 높다.
		//1~10출력
		int n = 1;
		while(n<=10) { //n:1~10인 경우 while(true){
			System.out.println(n++);
		}
		*/
		/*
		int n=1;
		while(n>=10) {
			System.out.println(n--);
		}
		*/
		//'A'~'Z'사이를 꼐속 입력 받는 프로그램
		//대문자가 입력되지 않으면 종료합니다.
		Scanner sc =new Scanner(System.in);
		/*
		char ch = 'A';
		
		while(ch>='A'&& ch<='Z') { //while(ch>=65&&ch<=90) 
			System.out.println("대문자 입력>>>");
			ch =sc.next().charAt(0);
			
		}
		*/
		//입력 받은 정수를 모두 더 해줍니다.
		//0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		//합계를 출력해 봅니다.
		int total = 0;
		int n= 0; //예1-1을 주면 와일문 영역은 벗어나고 출력결과가 안나온다.
		while(n>=0) {
			System.out.println("양수 입력 >>>");
			n =sc.nextInt();
			total+=n;
			
		}
		total -=n; //n이 음수일때 처리되므로, -로 처리합니다.예1 total=n-n; 출력결과 합 +1이 나온다.
		System.out.println("합계는"+total+"입니다.");
		
		sc.close();
	}
}

