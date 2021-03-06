package ex03_api;

import java.util.Calendar;
import java.util.Calendar.Builder;
import java.util.Date;

// 2.Calendar를 활용해서 기념일 게산하기
// 1)두 개의 날짜를 만들고, 그 중 하나는 기념일로 수정
// 2)날짜의 차이를 구하고,일 수로 출력하기

public class Quiz02 {

	public static void main(String[] args) {
		
		Calendar anniversary =Calendar.getInstance();
		anniversary.set(2000, 0, 1);//이렇게하면 2000-01-01 이렇게 나온다.
		
		Calendar today = Calendar.getInstance();
		/*
		 * getInstance() 기본 시간대 및 로케일을 사용하여 달력을 가져옵니다. 
		 * 반환 된 캘린더는 기본 FORMAT 로케일을 
		 * 사용하는 기본 시간대의 현재 시간을 기반으로합니다
		 */
		
		//타임스탬프의 차이를 구합니다.
		long elapseTime = today.getTimeInMillis()-anniversary.getTimeInMillis();
		//일렉 타입을 밀리초를 바꿔서 
		
		//밀리초 -> 일(1000 밀리초 * 60 *60 *24 ==1일)
		long elapseDat =elapseTime /(1000*60*60*24);
		System.out.println("경과한 일수는"+elapseDat+"일 입니다.");
	}
}
