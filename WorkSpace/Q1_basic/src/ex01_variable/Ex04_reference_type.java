package ex01_variable;

public class Ex04_reference_type {

	public static void main(String[] args) {
		
		
		//reference type
		//primitive type을 제외한 모든 type(자료형)
		
		String s1 = "apple"; //사과 담겨있는 주소값 또는 참조값
		String s2 = new String("apple"); //s2도 마찬가지로 메모리 주소 값 말하는것이다.
		
		// s1에 저장된 데이터
		//"apple"이 저장되어 있는 메모리 주소(참조)값이 저장되어 있다.
		
		System.out.println(s1==s2); //두 "apple"이 저장된 주소가 다르다.
		
		
	}

}
