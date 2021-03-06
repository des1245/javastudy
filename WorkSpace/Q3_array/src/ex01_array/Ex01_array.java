package ex01_array;

/*
 * 배열(array)
 * 1.변수가 여러 개 필요할 때 사용합니다.
 * 2. 같은 이름 + 식별 번호를 통해서 표현합니다.
 * 3.선언
 * 	1)int[] a = new int[3]; //int 타입 변수 3개를 사용할 수 있는 배열 a 생성 자바 기본 배열 선언
 * 	2)int[] a;
 * 		a=new int[3];
 * 	3) int a[] = new int[3]; //이름 붙히는 방식은 c언어의 스타일 따라가면서 지원 해주는것 뿐이지
 *	// 실제로 쓸수 있으나 쓸필요 없다. 그러니 비추천
 * 4.초기화
 * 	1)int[] a={10,20,30}; //int[]배열 a선언 {초기화}; ,{} 중괄호를 제비괄호 라고도 부르긴 한다.
 * 	2)주의사항: 아래는 안 됩니다. 초기화는 반드시 선언 할 때 같이 진행한다.
 * 	  int[] a;
 * 	  a ={10,20,30};
 * 5.생성되는 변수
 * 	int[] a = new int[3];
 * 	a[0] : 0으로 초기화가 되어 있는 상태(자동)
 * 	a[1] : 0으로 초기화가 되어 있는 상태(자동)
 * 	a[2] : 0으로 초기화가 되어 있는 상태(자동)
 * 6.용어
 * 	int[] a = new int[3];
 * 	1)배열이름:a
 * 	2)배열길이:3(a.length) //a.length <- a의 길이
 * 	3)인덱스 : 0,1,2 (0부터 시작한다.)
 * 		만약: 사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException 예외가 발생합니다.
 * 		나중에 가서 예외 처리 발생도 배우게 된다.
 */
public class Ex01_array {

	public static void main(String[] args) {

		//1. 배열의 선언 및 생성
		int[] a = new int[3];
		
		//2.확인
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//3.배열의 순회 -배열의 여러개를 순서대로 찾아가는것을 순회
		//배열의 순회는 인덱스 기준 이며 
		//배열의 인덱스는 0~길이-1까지 가능합니다. --> 0 <= 인덱스 <길이
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//4. 가용 범위를 벗어난 인덱스를 사용해 봅니다.
		System.out.println(a[3]); //배열 선언 3인덱스 사용이 불가능하며 0부터2까지 받게 안된다.
		
		
	}
}
