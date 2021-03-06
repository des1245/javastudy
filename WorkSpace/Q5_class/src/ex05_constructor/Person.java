package ex05_constructor;

/*
	생성자(constructor)
	1.객체를 생성하는 메소드입니다.
	2.특징
		1)결과타입 : 존재하지 않습니다. 아예 작성하지를 않습니다.
		2)메소드명 : 클래스명과 같습니다.
		3)매개변수 : 일반 메소드처럼 사용합니다.
	3.호출시점
		:객체를 생성하기 위해서 new를 호출하면 그 때 호출됩니다.
 */
/*
	객체 생성						             생성자
	Person P =new Person()             Person(String name){...}
	Person p =new Person("james")      Person(String name){...}
	Person p =new Person("ali",20)     Person(String name, int age){...}  
 */

public class Person {
	
	//field
	String name;
	int age;
	char gender; 
	//Person(String name,int age,char gender) 생성자의 받아서
	//문자 젠더 잇는 생성자에 연결된부분이다.
	
	// constructor
	Person(String name,int age,char gender){ //인수가 받아서 3개를 저장하는곳
		this.name =name;
		this.age =age;
		this.gender =gender;
	}
	Person(String name){// 지금 하고잇는것 아래것두 이2개는 생성자 오버로딩을 하고있는것
		
		this(name,0,'\0'); //그래서 매개변수를 3개를 찾아서 호출하는것
		//this.name = name; 
	}
	
	Person(String name,int age){  //인수는 3개인데 하나가 안보여서 그런거다.
		
		this(name,age,'\0');//생성자 디스 이며 자주 사용되는 개념은 아니다.
		//매개변수 3개를 찾아서 보내는것 
		/*
		this.name =name;
		this.age =age;
		*/
	}
	Person(){ //아무것두 안주고 찾기
		this(null,0,'\0');
	}
}
