package ex03_api;

/*
 * wra
 * 1.primitive type -> reference type 변경해주는 클래스입니다.
 *   프리미티브 타입 -변수 ->레퍼런스 -객체 즉, 변수-> 객체 변경해주는 클래스 입니ㅏㄷ.
 *   3.종류
 *   	1)int ->Integer
 *   	2)long ->Long
 *   	3)double -> Double
 *   	4)char -> character
 *   	5)boolean -> Boolean
 *   4.용어
 *   	1)Auto Boxing : primitive 값-> reference 객체 값을 바궈쭈는 오토 박싱이다.
 *   	2)Auto UnBoxing : reference -> primitive 값 객체 값레퍼런스 객체를 
 *   	     프리미어타입 값으로 바꿔즈는 오토 언박싱이다.
 */	
public class Ex06_wrapper_calss {

	public static void main(String[] args) {
		
		Integer a =new Integer(10);
		Integer b =new Integer("20");
		Integer c =30; //Auto Boxing 된부분 레퍼런스 객체된상태이다.
		
		int total =a + b + c; //이 3개의 객체가 다시 인티저 돌아가는 오토 언박싱이 진행된다.
		System.out.println(total);
		//우리가 쓰는 Integer.parsInt사용하는 캐스팅이라 구지 여기서 사용하지 않은것
		//이미 알고 있기에 캐스팅 방법을
		//4장 api는 여기서 끝 2021-03-11 오전10:45

	}
}
