package ex07_recursive;

public class SayHello {
	void say(int n) {
		//매개변수 n을 받아서 say돌아가면서 다시 매개변수 돌아와서 5 4 3 2 1로 된다.
		if(n>0) { //0은 0보다 크지 않기 때문에 
		System.out.println("Hello");
		say(n-1); //재귀적 호출
		}	
	}
}
