package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		//1.소스코드의 특정 위치를 지정하는 방법이니다.
		//2.방법
		//	label: 소스코드
		//dan x n =(dan * n)
		//라벨 많이 사용하면 스파게티코드가 별루 안좋다.
		outer : for(int dan =2; dan <=9; dan++) {
			inner : for(int n=1; n<=9; n++) {
				System.out.println(dan+"X"+n+"="+(dan * n));
				if(dan == 5 && n ==5) {
					//break inner;
					break outer;
				}
			}
		}
		
		/*
		label이 없을 때
		int n;
		for(int dan =2; dan <= 9; dan++) {
			for( n=1; n<=9; n++) {
				System.out.println(dan+"x"+n+"="+(dan * n));
				//여기서 추가코드 넣기 5x5=25까지만 나오게하고 나머지는 아래 다른 코드로 들어가게 하기
				if(dan==5&&n==5) {
					break;
				}
			}
			if(dan==5&&n<=5) {
				break;
			}
		}
		*/
	}
}
