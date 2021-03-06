package ex03_api;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
	날짜/시간 패턴(pattern)
 	1. 년: yy,yyyy
 	2. 월: M,MM
 	3. 일: d,dd
 	4. 요일 : E(일~토)
 	5. 오전/오후 : a(오전/오후)
 	6. 시간
 		1)h, hh //2개를 쓰거나 하나 쓰던 소문자는 12시간 h
 		2)H, HH //2개를 쓰거나 하나 쓰던 대문자는 24시간 H
 	7. 분: m,mm
 	8. 초: S, SS
 */
public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		
		//이거 중요 하지않다. 오늘 배운건 필요가없는 이유 어제도 2021-03-10에도 
		//데이트 필요 없는 이유 SQL데이터베이스에서 알아서 처리하기 위해 필요하지 않다는 점이다.
		Date date =new Date(System.currentTimeMillis());
		//밀리세컨->세컨->분->시간->일 로 변환 즉, /1000/60/60/24
		//
		String pattern ="yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("non-pattern:"+date); //패턴이 없을때 
		System.out.println("pattern:"+sdf.format(date)); //패턴이 있을때 
		//결과가 다르다는 것을 알수 있다.
		
	}
}
