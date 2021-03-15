package Quiz05;

public class Circle {
	
	//field
	double radius; //반지름
	
	//method
	void setRadius(double radius) {//레디어스 인수값 받아온것
		this.radius =radius;
		//this 키워드는 이 클래스를 기반으로 생성된 인스턴스를 가리키는 참조

	}
	double getCircum() {
		return 2 * Math.PI * radius ;
	}
	double getArea() {
		return Math.PI * Math.pow(radius, 2) ;
	}
}
