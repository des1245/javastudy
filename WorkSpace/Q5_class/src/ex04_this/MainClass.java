package ex04_this;

/*
 this
 1.this는 객체 자신을 의미합니다.
 2.어떤 클래스 내부에서만 사용합니다.
 3.활용
 	1)this.필드 (가장 주된 활용)
 	2)this()
 	
 */

public class MainClass {

	public static void main(String[] args) {
		
		//method
		Car myCar =new Car();
		myCar.set("520d", "BMW", 7500);
		myCar.info();
		
	}
}
