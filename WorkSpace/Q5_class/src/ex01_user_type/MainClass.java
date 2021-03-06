package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
		//메인 클래스를 메인하는곳
		
		//클래스 Person을 타입으로 하는 "객체"를 생성합니다.
		/*
		 * 1.타입:Person
		 * 2.객체:p1
		 */
		Person p1 = new Person(); //뉴에 p1 사람을 한개 만들어서 1개
		
		//클래스에 포함된 멤버(필드,메소드)는 마침표(.)를
		//이용해서 호출합니다.?
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.gender); //실제로 안보이는 널문자 하지만 존재하고있는것
		System.out.println(p1.isKorean);
		//널값, 0,0.0,펄스값 암기해두는게 좋다. 여기서 캐릭터(char)은 잘쓴다고 강사님께서 말씀해주심
		
		//Person은 reference type입니다.
		System.out.println(p1); 
		//new person()으로 생성된 객체의 "주소(참조)"가 저장되어 있습니다.
		//ex01_user_type.Person@1554909b 클래스 타입의 주소 알려주고잇는것
		//
		//java.lang.util 이거랑 비슷하다.
		
		Person p2 =p1; //p2는 객체p1의 "주소(참조)"를 그대로 가지고 있습니다.
		System.out.println(p2);
		p2.name ="alice";
		System.out.println(p2.name); 
		System.out.println(p1.name); 
		//15번지에 이름을 엘리스로 바꿔라 그래서 p2이름도 15번지 이름 p1도 15번지 이름 이다.
		//하나의 객체이름이 2개를 존재하고 있는것이다.
		
		/*
		 * 실제 객체는 한개 p1->15번지 person클래스 15번지 ->p2 15번지 
		 * 예: jps -> java -> 또 넘기고 -> 넘겨서 참조타입을
		 * 어디서 작업을 하든 같은곳에서 작업이 하기 때문이다. 
		 * 15번진넘기고 연결되는 부분 다른곳에서 연결하든
		 * 다넘기고 수정 중간에서 수정하지 말기
		 * 
		 * quiz01패키지
		 * 퀴즈 패키지도 메인으로 나간다 클래스 안에 넣어서 퀴즈로할것이다.
		 * -다음 정보를 저장하는 Book 클래스를 새엇ㅇ하고 
		 *  의의 정보를 저장하고 사용해 봅니다.
		 *  1.제목
		 *  2.저자
		 *  3.가격
		 *  4.재고
		 *  5.출판일자
		 *  6.베스트셀링 유무
		 */
	}
}
