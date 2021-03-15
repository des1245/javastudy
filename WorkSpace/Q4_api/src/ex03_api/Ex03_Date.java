package ex03_api;

import java.util.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		//java.sql.Date sql은 쿼리문으로 불린다. 앞으로는 sql에서 사용 할것이다.
		//DB의 Date타입에 맞게끔 wrapping 처리한 클래스입니다.
		long date =System.currentTimeMillis(); //다시 올라가서 롱타입을 쓸거
		Date today = new Date();//뉴데이트는  평생 쓸일 없다.
		//자바에서 보내는게 아니라 자바 sql을 연결 하여 데이트를 데이터베이스sql에서 할것이기
		//때문에 쓸일은 없다.
		System.out.println(today);
	}
}
