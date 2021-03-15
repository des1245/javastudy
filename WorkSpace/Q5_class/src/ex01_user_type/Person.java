package ex01_user_type;
/*
 * 	클래스 구성
 * 	1. 필드(field)
 * 		:클래스에 선언한 변수(값)
 * 	2. 메소드(method)
 * 		:클래스에 정의한 함수 (기능) 기능은 어떤일을 할수 있는것 관한부분
 * 	
 */
public class Person {
	
	//필드를 선언합니다. (변수 선언 합니다.)
	//일반 변수와 다르게필드는 자동으로 초기화가 됩니다. (0,false, null 등) 0과같은 널의 초기값
	
	String name; //null
	int age; //0
	double height; //0.0
	char gender; // '\0' (널 문자) 널-보이지 않는 뜻 하지만 존재하는 문자 이다.
	boolean isKorean; //false(한국 사람으로 코리아 아니면 펄스)
	/*public static void main(String[] args) {
	메소드 선언
	}
	*/
}
