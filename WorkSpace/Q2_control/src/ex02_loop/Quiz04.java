package ex02_loop;


//4.아래와 같은 모슴으로 출력해 보기
//2x2=2 3x1=3 ...9x1=9
//2x2 3x2 =6 .... 9x2=18
//...
//2x9=18 3x9=27... 9x9=81

public class Quiz04 {

	public static void main(String[] args) {
		
		for(int n=2; n<=9; n++) {
			for(int n1=1; n1<=9; n1++) {
				System.out.print(n+"x"+n1+"="+n*n1+"\t");
			}
			System.out.println("");
		}

	}

}
