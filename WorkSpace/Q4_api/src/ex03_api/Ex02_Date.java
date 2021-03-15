package ex03_api;

import java.util.Date;

public class Ex02_Date {

	public static void main(String[] args) {
		
		//java.util.Date
		
		//1. 자바 내에서 사용하는 날짜/시간 처리 클래스입니다.
		//2. 많은 메소드가 deprecate(사용의 반대하다) 되었기 때문에 사용하지 않아도 좋습니다.
		Date today = new Date(); //date부분에서 jdk부분에 사용 하지못하게 해둔게 있다.
		System.out.println(today);
	}
}
