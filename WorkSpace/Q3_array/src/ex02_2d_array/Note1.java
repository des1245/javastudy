package ex02_2d_array;

import java.util.Scanner;

public class Note1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] dict = {
				{"가을","fall"},
				{"겨울","winter"},
				{"봄","summer"},
		};
		
		int n=0;
		
		for(int i=0; i<dict.length; i++) {
			System.out.println(dict[i][0]+"을 스펠링 하면?");
			String n1 =sc.next();
			if(n1.equalsIgnoreCase(dict[i][1])) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		}
		System.out.println((dict.length));
	}
}
