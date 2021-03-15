package ex02_loop;

import java.util.Scanner;

//2. 영화 평점을 입력 받아서 *을 출력
//평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade =0;
		do {
			System.out.println("평점 입력 >>>");
			grade = sc.nextInt();
		}while(grade <1 || grade >5);
		String stars =""; //빈 문자열("")은 문자열 연결 연산(+)에서 초기화로 사용하는것이 좋다.
		//null값이 문자열의 인식 불상사 일어나서 초기값문자열은 빈문자열초기화가 좋다.
		for(int n=0; n<grade; n++) { //grade 만큼 반복됩니다.
			stars+="*";
		}
		System.out.println("평점:"+grade+"("+stars+")");
		/*
		직접 풀은 문제
		int n=0;

		do{
			if(n!=0) {
				System.out.println("잘된 평점 다시 입력 >>>");
			}
		System.out.println("영화 평점을 입력 >>>");
		n=sc.nextInt();
		}while(n>=4);
			System.out.println("*");
			sc.close();
		*/
	}
}
