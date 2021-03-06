package ex01_array;

import java.util.Scanner;

//3.성적 관리 프로그램
//학생들의 점수를 입력 받아서
//평균, 최대값,최소값 점수를 출력

public class Quiz03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] students ={"타요","브레드","스폰지밥"};
		int[] scores = new int[students.length];
		
		//점수를 입력 받습니다.
		for(int i=0; i<scores.length; i++) {
			System.out.println(students[i]+"의 점수 입력 >>>");
			scores[i]=sc.nextInt();
		}
		//평균(합계/개수),최소,최대값을 저장할 변수를 선언하고, 초기화를 진행합니다.
		//첫 번째 학생의 점수를 초기화 값으로 사용합니다.
		int total = scores[0];
		int min = scores[0];
		int max = scores[0];
		String top = students[0];
		String bottom = students[0];
		//첫 번째 학생의 점수는 제외하고 합계,최소,최대값을 구합니다.
		//인덱스를 1부터 사용합니다.
		for(int i=1; i<scores.length; i++) {
			total += scores[i]; //total =total + scores[i];
			if(min>scores[i]) {
				//최소값 미니엄즈랑 스코어 비교,현재 최소값 학생 낮은 점수를  낮게 잡은것
				//2번째 해석 현재 저장된 최솟값 보다 작은 점수가 나타난다면,
				min = scores[i]; //그 작은 점수를 최소값으로 사용하고
				bottom = students[i];
			}
			if(max<scores[i]) {//현재 저장된 최대값 보다 큰 점수가 나타난다면,
				max=scores[i]; //그 큰 점수를 최대값으로 사용합니다.
				top = students[i];
			}
		}
		for(int i=1; i<scores.length; i++) {
			total+= scores[i];
		}
		System.out.println(total);
		//결과 출력
		System.out.println("평균:"+((double)total/scores.length)+"점");
		//(double)total 캐스팅 작업 토탈 정수를 더블로 바꾼것
		System.out.println("최소:"+min+"점("+bottom+"점수)");
		System.out.println("최대:"+max+"점("+top+"점수)");
		sc.close();
		/*
		풀다가 못푼 상태
		String[] students ={"타요","브레드","스폰지밥",""};
		//학생의 길이가 스코어 길이에서 자동으로 변환 돼기 때문이다. 학생에서 하나지우면 배열길이 3되고 
		//추가하면 배열길이 4 된다.
		int[] scores = new int[students.length];
		int n1 =scores.length;
		String[] temp = new String[students.length+ n1];
		for(int i=scores.length; i<temp.length; i++) {
		System.out.println("성적 입력 >>>");
		scores[i] = sc.nextInt();
		System.out.println(temp[scores[i]]);
		}
		*/
	}
}

