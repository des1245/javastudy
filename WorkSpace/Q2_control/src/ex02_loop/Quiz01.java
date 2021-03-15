package ex02_loop;
//맞힐때까지 계속 물어보는 퀴즈 입니다.
//대한민국의 수도는? >>> 서울 또는 seoul
//정답입니다.
//대한믹국의 수도는? >>> 인천
//오답힙니다.

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		예2
		String city;
		String city ="";
		문자열 초기값 선언 방법 2가지 하나는 아래잇는것 
		*/
		String city = null;
		do {
			if(city != null) { 
				/*
				city = city ! null; <- 0 = 0 낫으로 변환된 1이다.1그래서 0이 나옴
				이게 do 안의 영역이라서 그런지 모르겠지만 조건을 do에서 해결한다고 생각이 든다.
				*/
				System.out.println("오답입니다.");
			}
		
			System.out.println("대한민국의 수도는? >>>");
			city = sc.next(); 
	
		}while(!city.equals("서울") && !city.equalsIgnoreCase("seoul"));
		 /*
		 와일은 무한 루프이기도 해서 
		 */
		System.out.println("정답입니다.");
		sc.close();
		/*
		예1
		do {
			System.out.println("대한민국의 수도는? >>>");
			city = sc.next(); 
			/*
			선언된 시티는 do{안에서 만 사용 할수 있다.} while(city); 이부분이 안된다는것
			그래서 변수 선언은 바같 그리고 선언된 입력은 do안에서 하면 가능해진다.
			그래서 문자 비교를 와일에서 가능해지게 된다.
			
		}while(!city.equals("서울") && !city.equalsIgnoreCase("seoul"));
		
		서울이 아니면 낫을 사용한다. 서울이랑 비교해서 서울로 끝나면 출력 나오지만
		그게 아닌 낫을 붙히면 문자열 주소 참조값이 계속 값을 비교하여 오답이 나오게 
		할 수 있다.
		
		System.out.println("정답입니다.");
		sc.close();
		*/
	}
}
