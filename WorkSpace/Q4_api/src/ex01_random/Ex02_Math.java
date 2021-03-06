package ex01_random;

public class Ex02_Math {
//수학의 math클래스는  사용법을 많이 공부해두기! 주로 많이 사용하기 때문이다.
	public static void main(String[] args) {
		
		//java.lang.Math 임폴트가 필요없는 기본클래스
		System.out.println(Math.random()); //더블타입 랜덤으로 그 생성되는 0.0<=Math.random()<1.0의 결과가 나온다.
		//백분율은 확률 처리로 해결하는것이 좋다고 강사님께서 알려줬습니다.
		//Math.random()의 결과가 0.1보다 작은 확률은 얼마일까요.? 10%
		//Math.random()의 결과가 0.2보다 작은 확률은 얼마일까요.? 20%
		
		//10% 확률로 "강화성공",90% 확률 "강화 실패"
		if(Math.random()<0.1) {
			System.out.println("강화 성공");
		}else {
			System.out.println("강화실패");
		}
		//매쓰랜덤 소수점 몇점 나온다. 숫자 난수를 정수를 바꾸기 위해서 많아진건데
		//쉽게 생성 할수 있으나 매쓰클래스를 쓰는게 낮다.
		
		//Math.random() 			             0.0<=random<1.0
		//강사님 경우 Math.random() * 3              0.0 <= random <3.0
		//우리가 배운 케스팅 (int)(Math.random()*3)      0<=random<3
		//마지막 단계 최종결과(int)(Math.random()*3)+1   1<= random<4
		//(int)(Math.random()*3),(int)(Math.random()*3)+1 최종적 이 두가지 쓴다.
		
		//일반화에서 공식처럼활용합니다.
		//원하는 난수의 범위
		//(int)(Math.random()*개수)+시작값
		
		//(int)(Math.random()*6)+1 - 6개의 랜덤넘버가 만들어진다. +1했다. 그러면 1부터 6개
		
		//주사위:(int)(Math.random()*6)+1 -  1부터 6
		//로또   :(int)(Math.random()*45)+1 - 1부터45
		int lotto =(int)(Math.random()*45)+1;//이해를 시킬때 컴파일 결과 보고 왜 저렇게 나오는지 판단하고 반복 연습 중요!
		System.out.println(lotto);
		
		
	}
}
