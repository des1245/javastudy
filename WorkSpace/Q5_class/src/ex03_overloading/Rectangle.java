package ex03_overloading;

/*
  	오버로딩(overloading)
  	1.이름이 같고, 매개변수가 다른 메소드가 있을을 의미합니다.
 	   set       매개변수-> 전달되는게 다르다.
 	   예 date.set에서 나오는 매개변수가 여러개로 나오는것들이 다 오버로딩이라는것
 	2. 결과 타입은 오버로딩과 상관이 없습니다.
 	
 	지금 말한것 아래는 못쓰는것
 	int getArea(){}
 	double getArea()
 	이름이 같고 매개변수가 같으면 하나이다. 이러한부분은 쓰이지도 못한다고 알아두기
 */

public class Rectangle {

	//field
	int width; //너비
	int height; //높이
	
	//method
	void set(int w,int h) {
		if(w>0) {
			width =w;
		}
		if(h>0) {
			height=h;
		}
		/*
		 * else {
			width =0;
		} 불필요 한 코드
		 */
		/*
		 * width =w;
		 * height=h;
		 */
	}
	//void set(int w,int h)<-외부데이터를 받아서 전달해주면된다. 외부는 메인부분에서 데이터받아오는것  
	
	void set(int n) { //하나의 전달해주는것
		//자기 위에 있는 셋 메소드를 호출해서 처리합니다. 
		set(n,n); //이렇게 쓰이는것이 제일 훨씬 좋은것 셋매개변수n은 셋 메소드 매개변수w,h
		//부분에 전달하여 돌린다.
	}
	int getArea() {
		return width * height;
	}
}
