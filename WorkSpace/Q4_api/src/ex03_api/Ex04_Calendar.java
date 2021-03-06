package ex03_api;

import java.util.Calendar;
import java.util.Date;

public class Ex04_Calendar {

	public static void main(String[] args) {
		
		//java.util.Calendar
		//1.자바에서 날짜와 시간을 처리하는 주요 클래스
		//2.미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다.
		
		//현재 날짜와 시간 생성 방법 받게 없다.
		Calendar date =Calendar.getInstance();
		// 싱글턴패턴, 하나의 인스턴스만 가지고 공유
		
		int year =date.get(Calendar.YEAR);
		//날짜에서 년도를 빼는 
		int month =date.get(Calendar.MONTH)+1; //Calendar.MONTH 0~11
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo =date.get(Calendar.DAY_OF_WEEK);
		//System.out.println(weekNo); //요일 번호(일:1,월:2,....,토:7)
		String[] weekNmas = {"","일","월","화","수","목","금","토"}; 
		//""안쓰는 요소를 짱박아 놓는것 
		//""에서 "일"요일 인덱스 번호하고 딱맞게 떨어지는것
		
		System.out.println(year+"-"+month+"-"+day+""+weekNmas[weekNo]+"요일");
		int ampm =date.get(Calendar.AM_PM);
		int hour =date.get(Calendar.HOUR); //0~11
		int hour2 =date.get(Calendar.HOUR_OF_DAY); //0~23
		int minute =date.get(Calendar.MINUTE);
		int second =date.get(Calendar.SECOND);
		int millis =date.get(Calendar.MILLISECOND);
		System.out.println((ampm==0?"오전":"오후")+""+hour+":"+minute+":"+second+"."+millis);
		
		/*
		2021-3-10수요일 로직 하면서 3-10 이걸 자바스크립트로 연결해서 사용  배우게 될것 이다.
		오후5:29:4.241 로직 하면서 5:29	 이걸 자바스크립트로 연결해서  사용 배우게 될것 이다.
		*/
		
		//날짜 변경하기
		//date.set(year, month, date, hourOfDay, minute, second);
		date.set(1990, 10, 10, 9, 30,40); //날짜:1990년 11월 10일 9시 30분 40초
		System.out.println(date); //싱글베잇 포맷같은 그러한 부분을 배워야 한다.
		//date.set 다른날짜 변경하는 방법
		//내일은 그것에 대한 배울려구한다.
		
		//Calendar를 이용한 타임스탬프 구하기
		long timestamp =date.getTimeInMillis();
		//long timestamp는 밀리초
		System.out.println(timestamp);

		//과거에 사용했던 문제도 있기도 해서 
		//캘릭더를 ->Date타입 바꿔주는 작업
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		//java.sql.Date -> Calendar
		Calendar date3 =Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
		
	}
}
