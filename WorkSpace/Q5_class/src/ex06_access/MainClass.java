package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		
		//클래스에 디폴트 생성자가 없는 경우
		/*
		 Person(){ //디폴트 생성자에서 값이 전달이없어 널이랑 0이랑 널값이 나오는것 이다.
		 this(null,0,'\0');
		 }
		 */
		//"디폴트 생성자"가 자동으로 사용됩니다.
		//public Person(){}
		
		Person p = new Person();
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		
		System.out.println("이름:"+p.getName());
		System.out.println("나이"+p.getAge());
		System.out.println(p.isKorean() ?"한국인":"외국인");
		//간단한 입출력이지만 아주 중요하다.
	}
}
