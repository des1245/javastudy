package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		Person p =new Person(); //객체 생성자
		
		//매개변수 전달공간이 없고 출력방법 2
		p.set("alice", 30, '여', false,170.5,70.5);
		//p.info(); //인수가 4개
		
		//결과타입 출력방법3
		p.info(); //4.값이 어트게 나오는 출력인지 확인 방법
		double bmi =p.getBMI(); //1.값이 어트게 나오는 출력인지 확인 방법
		System.out.println(bmi);
		//펄슨bmi계산값을 해서 bmi리턴시키고 더블겟BMI메소드를 메인에
		//펄슨에서 가져와야 하면 객체 생성자가 필요하기 때문에 P.getBMI()가져오고
		//다시 double bmi 저장해서 출력 bmi를 시킨것 이다.
		
		/*
		//매개변수 전달공안활용하여 출력방법1
		//p.set("alice", 30, '여', false); //a에는 이름 나이에는30 젠더는 성별 이즈코리안은 한국사람이 아닌지 맞는지 넣을것이다.
		//Person 클래스에서 셋 전달하는 필드 인수 4개를  메인으로 와서 p.set 저장 공간에 넣고 출력 
		 
		인수 저장공안 있을때 사용 하는 출력 부분
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.isKorean);
		*/
	}
}
