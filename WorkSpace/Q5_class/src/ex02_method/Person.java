package ex02_method;
/*
 * 메소드(method)
 * 1.구성
 * 	 1)결과타입 -실행후의 결과가 무엇이냐 묻는것
 * 	 2)메소드명
 *   3)매개변수
 * 2.정의
 * 	 결과 타입 메소드명(매개변수){
 *      메소드본문
 *   }
 * 
 */
public class Person {
	
	// 필드
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height; //키와 몸무게 추가부분
	double weight; //인스턴스 필드
	//method (field를 사용할 수 있는 함수)
	//1.결과타입 :결과 값이 없다.(void)
	//2.메소드명 : set
	//3.매개변수 : 전달되는 인수가 없다.
	//4.역할 : 전달되는 인수를 필드에 전달합니다.
	
	
	//1
	//역활에 매개변수를 인수를 정해보기 String n,int a,char g,boolean isK
	void set(String n,int a,char g,boolean isK,double h,double w) { //스탠다드({) 이부분을 아래로 옮기지 말것 기본스탠다드 위치 쓰는게좋다.
	name =n;  //생성자(필드 초기화)
	age =a;  
	gender =g;
	isKorean =isK;
	height =h;
	weight =w;
	}
	
	//2.매개변수 전달방법이 없을때
	//1. 결과 타입 : 결과값이 없다.(void)
	//2. 메소드명  : info
	//3. 매개변수  : 전달되는 인수가 없다.
	//4. 역활    : 객체의 필드값을 출력해 줍니다.
	void info() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		System.out.println(isKorean ? "한국인":"외국인");
	}
	//결과타입 출력방법3
	//1.결과 타입: 결과값의 타입이 double 입니다.
	//2.메소드 명:getBMI
	//3.매개변수 : 전달되는 인수가 없다.
	//4.역활 : 객체의 체질량 지수(BMI)값을 결과로 반환합니다.
	double getBMI() { //2.값이 어트게 나오는 출력인지 확인 방법
		//bmi 몸무게 / 키제곱
		double bmi =weight /Math.pow(height/100, 2);//헤이트는 몫100에 제곱2
		return bmi; //3.값이 어트게 나오는 출력인지 확인 방법
	}
	 
}
