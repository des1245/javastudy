package ex01_variable;

public class Ex06_parsing {

	public static void main(String[] args) {
		
		//String 타입 변환은 parsing입니다.
//		int a= 10;
//		System.out.println((String)a); //casting이 안됩니다.
//		
//		String b="10";
//		System.out.println((int)b); //casting이 안됩니다.
		
		//1. 정수 int를 문자열 String으로 변환 하기
		int a=10;
		String a1 = String.valueOf(a);
		String a2 = ""+a; //문자열의 + 연산은 연결입니다. 결과도 문자열입니다.
		System.out.println(a1);
		System.out.println(a2);
		//""+a;나중에 이걸로 바꾸는 용도 쓰이는 날이 있을것이다. 알아두기 
		
		//2. 문자열 String을 정수 int로 변환하기 
		String b ="123";
		/*
		 * 1x10승2+2x10승1+3x10승0
		 */
		int bb = Integer.parseInt(b);
		System.out.println(bb);
		//3. 문자열String을 실수double로 변환하기
		String c ="1.5";
		double cc = Double.parseDouble(c);
		System.out.println(cc);
	}

}
