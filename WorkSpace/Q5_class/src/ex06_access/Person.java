package ex06_access;

/*
접근 제어자(access modifier)
1.private:클래스 내부에서만 볼 수 있습니다.
2.default: 같은 패키지에서만 볼 수 있습니다. access modiier를 지정하지 않으면 default: 끝낼 수 있다.
3.protected : 같은 패키지 또는 상속 관계에 패키지에서만 볼수 있습니다.
4.public : 어디서든 볼 수 있습니다.

극단적인것 private 클래스 내부 보는거랑 퍼블릭은 중요
디폴트랑 보호는 그렇게 나중에 공부를 해도 상관없다.

지정하는 방법
1.필드 private 합니다.
2.메소드(생성자,일반메소드)는 public 합니다.
 */

public class Person {

	//field <- 필드에 정보은닉 내부에서만 손댈수있는것 외부에서는 못본다.
	//메도드접근->필드 ->메소드 검토 
	//필드에 2개(메소드)만 막아주는 데이터베이스에 관리방식이다. 기본적인 방식이기도하다.
	//어제는 같은패키지에 디폴트상태였는데 같은 패키지이면 접근이 되는데 마음데로왓다갔다되는데
	/*
	 이게 디폴트 상태 ex01_user_type소스코드
	 String name; //null
	int age; //0
	double height; //0.0
	char gender; // '\0' (널 문자) 널-보이지 않는 뜻 하지만 존재하는 문자 이다.
	boolean isKorean;
	
	메인클래스 외부 이것두 디폴트 상태
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.gender); //실제로 안보이는 널문자 하지만 존재하고있는것
		System.out.println(p1.isKorean);
	 */
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	//메소드 접근 내부허용 불린접근해서 다시 나갈때 검토하면서 이러한 프라이벳 쓸려면 2개를 줘야한다.
	
	//method
	//1.필드에 값을 전달하는 메소드:setter
	//2.필드값을 반환하는 메소드:getter
		
	//name에 접근할 수 있는 메소드
	//1. name에 값을 전달하는 메소드
	public void setName(String name) {
	this.name = name;
	}
	//2. name을 반환하는 메소드
	public String getName() {
		return name;
	}
	//age에 접근할 수 있는 메소드
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public boolean isKorean() {
		return isKorean;
	}
	public void setKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//source - 제너레이터 겟 and 셋
	//안된다는 것은 이미 만들어져서 그런거구 아니면 만들어야 할때 겟셋 그걸 적용하면 바로 한번에 뜬다.
}
