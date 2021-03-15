package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
		//4. 관계 연산자: >,>=,<,<=,==,!=
		// 결과의 타입은 boolean입니다.
		int age=20;
		boolean isAdult = age>=20;
		System.out.println(isAdult); //true 또는 false
		
		//5.논리 연산자: &&,||,!
		//대부분 관계 연산자와 함께 사용됩니다.
		// 1)엔드 &&: 모든 관계 연산의 결과가 true 이면, true, 아니면 false
		// 2)오아 ||: 관계 연산의 결과가 하나라도 true 이면 true, 아니면 false
		// 3)낫 ! : 관계 연산의 결과를 반대로 변경
		int a = 10;
		int b = 10;
		System.out.println(a==10&& b==10); //둘다 10 이므로 true
		System.out.println(a==10||b==10);
		System.out.println(!(a==10)); //낫을 추가해야하 하면 가로를 추가해야한다.
		
		System.out.println(a==0&&++b>0); //false(&& 연산은 false가 나오면 연산을 멈춥니다.)
		//이러한 논리 국가적인에서 해석을 이렇게 알려준것이 있다 라고 한다. =숏 서큣 디벨로 메이션 - 짧게 짧게 계산을 한다는 의미
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a==10||++b>0); //true(||연산은 true가 나오면 연산을 멈춥니다. 어차피 트루 나오기때문에)
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
