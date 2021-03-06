package ex01_random;

//5. 5x5크기의 빙고 생성하기
//1) 1~25를 bingo 배열에 순서대로 저장해 두고,
//2)섞는다.
public class Quiz05 {

	public static void main(String[] args) {
		
		//final 상수: 변하지 않는 값을 저장해 두는 경우에 사용
		final int SIZE = 5; //파이널은 상수는 정수 선언을 대문자로 처리해야한다.
		
		int[][] bingo =new int[SIZE][SIZE];
		
		//1~25 순서대로 생성
		for(int i=0; i<SIZE; i++) { //사이즈는 상수값에 행열로 포문에 사용해도 상관없다.
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] =(i* SIZE)*(j*1); //(i* SIZE) 0 5 15 20 (4*5)*(5*1)
				
			}
		}
		//섞기
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				int x=(int)(Math.random()*SIZE)+0; //0~4사이 인덱스로 만들어진다.
				int y=(int)(Math.random()*SIZE)+0;
				
				int temp =bingo[i][j]; //템프에 백업
				bingo[i][j] = bingo[x][y]; //빙고에 저장
				bingo[x][y] = temp; //빙고 i,j저장
				
			}
		}
		//출력
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
