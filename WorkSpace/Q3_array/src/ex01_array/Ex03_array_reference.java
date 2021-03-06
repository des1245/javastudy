package ex01_array;

import java.util.Scanner;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		//배열은 reference(참조) type입니다.
		
		int[] arr =new int[3];
		System.out.println(arr); //new int[3]을 통해서 생성된 배열 요소들의 주소가 저장되어 있다.
		/*
		[I@edf4efb 이부분에 @는 (at)어디에 있는
		edf4efb 16진수 어드레스  ed번지에 있는 배열 요소 이다.
		
		메모리 원리 구조는 arr배열변수에서 메모리공간 ed번지주소값이 들어가 있으며
		arr[0]인덱스 값에 메모리 공간에 ed번지 주소값이 존재하는 것 이다.
		*/
		int[] a= {1,2,3}; //배열 a의 길이는 3
		int[] b= new int[10]; //배열 b의 길이는 10
		
		 //b[0] = a[0],b[1] =a[1],b[2]=a[2]
		 for(int i=0; i<a.length; i++) {
		 b[i]=a[i];
		 }
		
		//a에는 {1,2,3}이 저장된 주소
		//b에는{1,2,3,0,0,0,0,0,0,0} 저장된 주소
		a=b; //a에는 {1,2,3,0,0,0,0,0,0,0} 저장된 주소 있음
		
		//메모리 누수는 컴퓨터가 쓰다가 보면 메모리주소 공간 주지않는곳에 남겨져 있어서 누수 되버린다.
		//다른언어는 상관없지만 자바공간이 알아서 찾아서 누수공간을 처리해준다.
		//Garbege collecter
		
		//배열 a의 길이가 증가
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		/*
		 * 1.길이가 3인 String 타입의 배열을 선언하고
		 * 	 3개의 이름을 입력 받아서 배열에 저장하고 확인하기
		 * 2.String[] friendList={"타요","짱구","스폰지밥"};
		 * 	 새로 사귄 친구의 수를 입력 받아서,
		 *   그 만큼 friendList 배열의 길이를 늘리기
		 */
		Scanner sc = new Scanner(System.in);
		String[] friendList= {"타요","짱구","스폰지밥"}; 
		//초기값은 바꿀수가 없다 그 이유는 방법을 나눈다고해도 초기값기준에서 명령으로 방법이 없다는것 
		
		System.out.println("새로 사귄 친구가 몇 명? >>>");
		int newFriend = sc.nextInt();
		
		//새로운 배열을 만듭니다.
		String[] temp = new String[friendList.length+newFriend];
		
		//새로운 배열로 기존 친구 명단을 넘깁니다.
		for(int i=0; i<friendList.length; i++) {
			temp[i]=friendList[i];
		}
		//새 친구들을 입력 받습니다.
		for(int i = friendList.length; i<temp.length; i++) {
			//friendList.length배열이 3 <temp.length 배열길이 입력8일경우
			System.out.println("새 친구 이름 >>>");
			temp[i] =sc.next();
		}
		//새로운 배열로 갈아탑니다.
		friendList=temp;
		
		//확인해 봅니다.
		for(String friend:friendList) {
			System.out.println(friend);
		}
		//자사 플랫폼에 있는곳들이 좋다.
		/*
		String[] names =new String[3];
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+"번째 이름 일력 >>>");
			names[i] = sc.next();
			System.out.println(names[i]);
		}
		//이러한 방식을 포문아래거랑 위에거를 연습해보길 바람 복습은 중요함
		for(String name : names) {
			System.out.println(name);
		}
		sc.close();
		*/
		/*
		풀다가 안풀리는 상태
		String[] n = new String[3];
		int i=0;
		System.out.println("3개 이름 입력 >>>");
		n[1] = sc.next();
		
		for(i=0; i<=n.length; i++) {
			System.out.println(n[i]);
		}
		*/
		/*
		풀다가 안풀리는 상태
		String[] friendList= {"타요","짱구","스폰지밥"};
		String[] n =new String[3];
		int i=0;
		System.out.println("입력>>>");
		n[3] = sc.next();
		
		for(i=0; i<friendList.length; i++) {
			friendList[i]=n[i];
		}
		n=friendList;
		for(i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		*/
	}
}
