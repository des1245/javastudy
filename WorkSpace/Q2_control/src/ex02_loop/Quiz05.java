package ex02_loop;

import java.util.Scanner;

//5.10000원 모두 사용하기
//현재 10000원이 있습니다.
//결제금액 >>> 5000
//현재 500원이 있습니다.
//결제금액 >>>-100
//-100원은 결제 할 수 없습니다.
//현재 5000원이 있습니다.
//결제금액 >>>10000
//5000원이 부족합니다.
//현재 5000원이 있습니다.
//결제금액 >>>5000
//현재 0원이 있습니다.

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money=10000;
		while(true) {
			System.out.println("현재"+money+"원이 있습니다.");
			if(money ==0) {
				break;
			}
			System.out.println("결제 금액 >>>");
			int spend =sc.nextInt();
			if(spend<0) {
				System.out.println(spend+"원은 결제할 수 없습니다.");
			}else if(spend> money) {
				System.out.println((spend-money)+"원 부족합니다.");
			}else {
				money -= spend; //money = money-spend
			} //결과 -1을 넣어보면 작동에서 -1은 작동에서 증가해야하는데 안하는경우도잇음 
		}
		
		/*
		풀다가 말은상태
		int n;
		System.out.println("금액:");
		n = sc.nextInt();
		for(n=0; n<=n; n++){
			if(n%0.50==0) {
				//5.10000원 모두 사용하기
				//현재 10000원이 있습니다.
				//결제금액 >>> 5000
				//현재 500원이 있습니다.
				//결제금액 >>>-100
				//-100원은 결제 할 수 없습니다.
				//현재 5000원이 있습니다.
				//결제금액 >>>10000
				//5000원이 부족합니다.
				//현재 5000원이 있습니다.
				//결제금액 >>>5000
				//현재 0원이 있습니다.
				System.out.println("결제금액"+n);
				break;
			}else if(n%0.50==0) {
				System.out.println("결제금액"+n);
				break;
			}
		}
		*/
	}
}
