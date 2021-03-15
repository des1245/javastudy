package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		//1주차 1일차 1교시 입니다.
				//1주차 1일차 2교시 입니다.
				//...
				//총 3주차
				//총 5일
				//총 8교시
		for(int in=1; in<=3; in++) {
			for(int out=1; out<=5; out++) {
				for(int n=1; n<=8; n++) {
					System.out.println(in+"주차"+out+"일차"+n+"교시");
				}
			}
		}
		/*
		for(int out = 1; out <=10; out++) {
			for(int in =10; in<=50; in+=10) {
				System.out.println(out+","+in);
			}
		}
		*/
		
	}
}
