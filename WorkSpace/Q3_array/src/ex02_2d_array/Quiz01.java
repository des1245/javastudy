package ex02_2d_array;

//1.인구 조사
//apt에 사는 사람 수를 초기화 해 놓고,
//전체 사람의 수를 출력
//1층에 3명이 삽니다.
//2층에 7명이 삽니다.
//3층에 6명이 삽니다.
//4층에 5명이 삽니다.
//5층에 7명이 삽니다.
//apt에 28명이 삽니다.

public class Quiz01 {

	public static void main(String[] args) {
		int[][]apt = {
				{1,2},
				{5,2},
				{3,3},
				{1,4},
				{5,2}
		};
		//2개의 합계 변수가 필요합니다.
		int floor =0; //각 층마다 사는 사람들의 합계
		int total= 0; //apt 전체에 사는 사람들의 합계
		
		for(int i=0; i<apt.length; i++) {
			floor=0;
			for(int j=0; j<apt[i].length; j++) {
				floor +=apt[i][j]; //apt i번째랑 j번째 2개를 합해서 플로에 넣어준다. floor= floor +i+j
			}
			System.out.println((i+1)+"층에는"+floor+"명이 삽니다."); //i+1은 층마다 증가  floor는 층마다 찹쳐진 i+j 인덱스값 
			total+= floor; 
		}
		System.out.println("apt에"+total+"명이 삽니다.");
		/*
		//5층 2호
		int[][]apt = {
				{1,2},
				{5,2},
				{3,3},
				{1,4},
				{5,2}
		};
		apt[0][0];
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				
				if(apt[i][j]||=1 && apt[i][j]=1) {
					
				}
			}
		}
			*/
		
	}
}
