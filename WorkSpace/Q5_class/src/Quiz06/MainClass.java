package Quiz06;



public class MainClass {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("홍길동전",5000);
		Book b3 = new Book("어린왕자","생택쥐베리",10000);
		
		b1.info();	//제목: 없음,저자:미상,가격:0원
		b2.info();	//제목:홍길동전,저자:미상,가격:5000원
		b3.info();	//제목:어린왕자,저자:생택쥐베리,가격:10000원
		
	}
}
//access modifier :private,public 이부분은 아직 많이 안해본 상황이다.
//타이틀적인 필드만 한거구 내일부터는 

//자바 수업2주남은 상황 
//jdbc 오라클 기본정보 테이블 이것저것 자바 프로그램에서 오라클데이터햇고 읽어오는 수업을 할것이다.

