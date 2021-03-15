package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {

		//do-while문
		//1.while문 입니다.
		//2.반드시 한 번은 실행하는 while문 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n=0;
		
		do{ //저스트 두 무조건하라는 의미
			System.out.println("양수만 입력 >>>");
			n=sc.nextInt();
			total += n; //total=n=0+입력 값;
		}while(n>=0); //와일문은 횟수가 정해져 있지 않을경우 사용하고 for문은 정해져있는경우 쓰인다.
			total -= n; //total=n=0-입력값;
			System.out.println("합계:"+total);
			sc.close();
		}
		
}

