package ex02_String;

//String의 +연산자를 많이 사용하면 성능이 떨어진다.

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		//java.lang.StringBuilder
		
		//문자열 생성
		StringBuilder sb =new StringBuilder("hello");
		StringBuilder sb1 =new StringBuilder("hello");
		
		StringBuilder sb2 =new StringBuilder("hello");
		
		//문자열 추가(핵심 메소드)
		sb.append("").append("java");
		
		System.out.println(sb1);
		
		//문자열 비교
		System.out.println(sb1.equals(sb2));
		//String이 아니라서 비교 못합니다. 즉, 지금 sb1에 메소드 문자열 생성했는데
		//메모리 공강 sb1에 헬로가 있고 sb2랑은 다른 공간으로 되있어서 
		//비교를 해도 펄스가 나오는 이유다.
		String str1 =sb1.toString();
		//문자열을 비교해야하면 투스트링으로 다시 바꿔준다.
		//성능을 위해서 스트링 빌더를문자열을 바꿔서 문자열로 출력해준것
		
		String str2 =sb2.toString();
		
		System.out.println(str1.equals(str2));
		
		//학습보조자료는 평가볼때 들어가 있으니 수업자료공유는 여태 배운것을 
		//자바와 sql을 다올리게 될것이다.
	}
}
