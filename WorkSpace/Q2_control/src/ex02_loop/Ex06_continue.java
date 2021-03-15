package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		//continue문
		//1. loop문으로 되돌아가서 다시 실행합니다.
		//2. continue문 이후의 코드를 실행하지 않기 위해서 사용합니다.
		/*
		int n =1;
		while(n <= 10) {
			if(n%2==1) { //홀수는 출력합니다.
				System.out.println(n);
			}
			n++;
		}
		int n=1;
		while(n<=10) {
			if(n%2 ==0) { //짝수는 while문으로 돌려보냅니다.
				continue; 
				/*
				 * 1이 10보다 작거나 같냐 1~10진행 1%2==0조건돼면 컨틴뉴하고
				 * 2로 증가 나중 지금 증가 없으니 결과 값에서 짝수만 보낸다.
			}
		}
		
		//      1       2    4
		for(int n=1; n<=10; n++) {
			if(n%2==0) {
				continue; //3
				//가독성은 for문이 효율이 좋다.
				//3번 컨틴뉴다음 출력결과 나중증가거친다음 
				//다시 1번부터 2번 하고 3번4번으로 순서가 된다.
			}
			System.out.println(n);
		}
		*/
		//소원을 3개 들어줍니다.
		//안 되는 소원은 "로또당첨"입니다. 나머지 소원은 모두 들어줍니다.
		Scanner sc = new Scanner(System.in);

		int count=0;
		String nList="";
		while(count<3) {
			System.out.println("소원 >>>");
			String n = sc.next();
			if(n.equals("로또당첨")) {
				continue;
			}
			nList += n;
			count++;
		}
		System.out.println(nList);
		sc.close();
	}
}
