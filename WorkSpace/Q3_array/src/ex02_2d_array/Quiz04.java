package ex02_2d_array;

import java.util.Scanner;

/*
4.성적 관리 프로그램
학생별 총점과 과목별 총점을 구해서 출력하기
스폰지밥의 국어 점수>>>10
스폰지밥의 영어 점수>>>10
스폰지밥의 수학 점수>>>10
...
		국어	영어	수학	학생합계 <- 약간의 빈칸을 서브젝트로 넣는다.
스폰지밥	10	10	10	30
타요		10	10	10	30
브레드	10	10	10	30
합계		30	30	30	90
*/
//30부분 합계아래에 행은 길이가 같으며 길이가 달라지긴 한다.
public class Quiz04 {

	public static void main(String[] args) {
		
		String[] names = {"스폰지밥","타요","브레드","학생합계"};
		String[] subjects = {"국어","영어","수학","학생합계"};
		int[][] scores = new int[names.length +1][subjects.length];
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<names.length-1; i++) {
			for(int j=0; j<subjects.length-1; j++) {
				System.out.println(names[i]+"의"+subjects[j]+"점수 입력 >>>");
				scores[i][j] =sc.nextInt();
				//각각의 점수: scores[i][j]
				//과목의 합계: scores[names.length -1][j]
				//학생의 합계: scores[i][subjects.length -1]
				//전체의 합계: scores[names.length -1][subjects.length -1]
				
				scores[names.length-1][j]+=scores[i][j];
				scores[i][subjects.length -1]+= scores[i][j];
				scores[names.length -1][subjects.length -1]+=scores[i][j];
				/*
				 * 1 scores[names.length-1][j]+=scores[i][j];         2 scores[i][subjects.length -1]+= scores[i][j];
				 * 
				 * 
				 * 
				 * 3          4 scores[names.length -1][subjects.length -1]+=scores[i][j];
				 */
			}
		}
				//제목 출력
				System.out.print("\t");
				for(String subject : subjects) {
					System.out.print(subject+"\t");
				}
				System.out.println();
				//본문 출력
				for(int i=0; i<scores.length; i++) {
					System.out.print(names[i]+"\t");
					for(int j=0; j<scores[i].length; j++) {
						System.out.print(scores[i][j]+"\t");
					}
					System.out.println();
				}
				sc.close();
		
		/*
		풀다가 말은 문제 
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				int n =(i*10)+(j+1);
				int tens = n/scores.length;
				
				boolean check1 = tens == 10 | tens == 20 | tens == 30;
				
			}
		}
		*/
	}
}
