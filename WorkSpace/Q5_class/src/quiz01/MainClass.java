package quiz01;

import java.sql.Date;
import java.util.Calendar;
//컨트롤+쉬프트+O 누르면 잘못들어간 임폴트를 정리해준다.

public class MainClass {

	public static void main(String[] args) {

		Book b =new Book();
		
		b.title ="어린왕자";
		b.writer="생텍쥐베리";
		b.price=10000;
		b.stock=20;
		Calendar date =Calendar.getInstance();
		date.set(2020, 0,10); //2020-01-10
		long timestamp =date.getTimeInMillis();
		b.pubDate = new Date(timestamp);
		b.isBest =true;
		System.out.println(b.title);
		System.out.println(b.writer);
		System.out.println(b.price);
		System.out.println(b.stock);
		System.out.println(b.pubDate);
		System.out.println(b.isBest ? "베스트셀러":"일반서적");
		/*
		풀다가 못풀은것
		Book p1 =new Book();
		Book p2 =p1;
		p2.B_name="컬";
		p2.B_name="컬";
		p2.B_name="컬";
		p2.B_name="컬";
		p2.B_name="컬";
		
		System.out.println(p2.B_name);
		*/
	}
}
