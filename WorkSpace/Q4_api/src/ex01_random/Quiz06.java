package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

//6.로또 구매하기
//1000원에 번호 6개 1세트가 나옵니다.
//얼마? >>>5000 5000원이면 5줄 3000원이면 3줄 3줄이면 3행으로 8열
//같은줄에는 동일한 번호가 나오면 안된다.

public class Quiz06 {
	public static void main(String[] args) {
		final  int SIZE=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마? >>>");
		int money =sc.nextInt();
		//행의 계수는 머니 나누기 1000
		int set = money /1000;
		
		int[][] lotto =new int[money/1000][6]; //행:머니입력/1000
		/*
		 * 1행 열12345 5에서 3을 빼오고 3
		 * 2행 열1254 4에서 5를 뻬오고 5
		 * 3행 124
		 * 1에서 45까지 순서대로 채워 놓으면 된다.
		 */
		for(int i=0; i<set; i++) { //세트 수많큼 작업을 하겠다.
			//1~45 순서대로 준비합니다.
			int ballCount =45;
			int[] balls = new int[ballCount];
			for(int j=0; j<balls.length; j++) {
				balls[j] = j+1; //45인덱스 저장=44+1; 
			}
			//balls 배열 -> lotto 배열
			//1.balls 배열의 인덱스를 랜덤 생성합니다.
			//2.해당 인덱스의 값을 lotto 배열로 보냅니다.
			//3.balls 배열의 마지막 요소를 랜덤 생성한 인덱스로 보냅니다.
			for(int j =0; j<lotto[i].length; j++) {
				int idx =(int)(Math.random()* ballCount)+0;
				lotto[i][j] =balls[idx];
				int lastIdx =44-j; // 수정부분
				
				//루프 마다 44 나오고 돌고 43 나오고 마지막은
				if(idx != lastIdx) {//idx가 라스트 인덱스가 다를때만 
				balls[idx] = balls[lastIdx];
				}
				ballCount--;
			} 
			// 2021-03-10,12:44분 - 실제로 지금 정렬은 빼고 다배운상태 
			/*
			// 세트별로 정령(오름차순)해서 출력하기
			for(int[] line: lotto) {
				Arrays.sort(line);//한 줄만 빼서 오름차순 정렬
				//배열의 어레이(유틸 어레이가 생김맨위에) 정수의 정령을 시키는것
				for(int n: line) {
					System.out.print(n+"\t");
				}
				System.out.println();
			}
			*/
		} //for(i 포문안에잇어서 출력 위치가 잘못된것  for(int[] line부분에
		//이중 포문안에 있을 경우 바같에 안하면 출력이 2개를 햇으면 2배로 나온다.
		//그 이유는 포문안에 돌아가는 루프가 그래서 그렇다.
		
		// 세트별로 정령(오름차순)해서 출력하기
		for(int[] line: lotto) {
		Arrays.sort(line);//한 줄만 빼서 오름차순 정렬
		//배열의 어레이(유틸 어레이가 생김맨위에) 정수의 정령을 시키는것
		for(int n: line) {
			System.out.print(n+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
