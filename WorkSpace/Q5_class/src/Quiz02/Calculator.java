package Quiz02;

public class Calculator {
	
	//method
	//1.결과타입 : 결과값이 없다.(void)
	//2.메소드명 : addtion
	//3.매개변수 : 전달되는 2개의 int 값이 있다.
	//4.역활 : 전달된 인수의 합계 결과를 아래와 같은 형식으로 보여줍니다.
	//1+2=3
	
	
	int num;
	int num1;
	void addtion(int n,int n1) {
		
		System.out.println(n+"+"+n1+"="+(n+n1));
	}
	//1.결과 타입 : 결과값의 타입이 int입니다..
	//2.메소드명  : subtraction
	//3.매개변수  : 전달되는 2개의 int 값이 있다.
	//4.역활        : 전달된 인수의 뺄셈 결과를 반환합니다.
	//			  항상 큰 수에서 작은 수를 뺍니다.
	
	int subtraction(int a,int b) { //그걸 저장하는 매개변수 int n2,int n3 이다.
		return (a>= b) ? a-b :a-b;
	}
}
