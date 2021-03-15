package Ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ex02_JOptionPanel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게 입력 >>>");
		double weight = sc.nextDouble();
		System.out.println("키 입력 >>>");
		double height = sc.nextDouble();
		
		height /= 100; //185.5nc -> 1.855m
		
		double bmi = weight /Math.pow(height, 2); //Math.pow(값,제곱을 해주는것)예:값 *값
		String healthCondition = (bmi>=25)?"과체중":(bmi>=20)? "정상":"저체중";
								// 1          2          3
		//1항 2항 3항
		System.out.println("체질량 지수:"+bmi+"("+healthCondition+")");
		sc.close();
				
		/*
		 6.
		System.out.println("주민번호입력(하이픈 없이) >>>");
		String id=sc.next();
		char genderNum = id.charAt(6);
		//String gender = (genderNum=='1'||genderNum=='3'? "남자":"여자");
		/*
		 문자는 코드 값을 가지고 있습니ㅏㄷ.
		 문자를 연산하는 경우 "코드 값"이 연산됩니다.
		 '1' % 2 --> 49 % 2
		 '2' % 2 --> 50 % 2
		 ----
		 알아두면 좋은 코드 값
		 '0' : 48
		 'A' : 65
		 'a' : 97
		
		String gender =(genderNum % 2 == 1) ? "남자":"여자";
		System.out.println("성별은"+gender+"입니다.");
		sc.close();
		*/
		/*
		5.
		System.out.println("숫자 입력 >>>");
		int iGender =sc.nextInt();
		
		//1방법 String gender =(iGender == 1||iGender ==3)? "남자":"여자";
		String gender =(iGender % 2 == 1) ? "남자":"여자";
		
		System.out.println("성별은"+gender+"입니다.");
		sc.close();
		*/
		/*
		4.
		System.out.println("매출액 >>>");
		int salesMoney = sc.nextInt();
		/*naming convension
		 * -snake case -src에 있는 밑줄 구분한것을 스네이크 케이스 이다.
		 * -lower camel case - 소문자 첫번째 단어와 단어를 석어서 쓰는 방식을 카멜 케이스 라고 한다. 
		 * -upper camel case - 대문자 첫번째 클래스
		
		System.out.println("등급 >>>");
		String grade = sc.next();
		//자바에서는 grade == "VIP":grade.equals("VIP"); 이렇게 쓰인다.
		//자바 스크립트에서는 grade == "VIP"; 이렇게 쓰인다.
		//double disCountRate = grade.equals("VIP") ? 0.2 : 0.05;
		double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2:0.05;
		//이퀄스이그노케이스 대소문자 상관없이 가능해진다.
		salesMoney -=(salesMoney * disCountRate);//더블과인트를 프로적션을 맞춰주는것
		System.out.println("실 매출액:"+salesMoney);
		sc.close();
		*/
		/*
		3.
		System.out.println("나이 입력 >>>");
		int age =sc.nextInt();
		System.out.println(age >= 20? "성인":"미성년자");
		sc.close();
		*/
		/*
		2.
		System.out.println("첫 번째 실수 >>>");
		double a =sc.nextDouble();
		System.out.println("두 번째 실수 >>>");
		double b =sc.nextDouble();
		
		double temp =a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
		sc.close();
		*/
		/*
		 1.
		System.out.println("국어 >>>");
		int kor =sc.nextInt();
		System.out.println("영어 >>>");
		int eng =sc.nextInt();
		System.out.println("수학 >>>");
		int mat =sc.nextInt();
		
		double ave = (kor+eng+mat)/3.0;
		System.out.println("평균:"+ave+"점");
		sc.close();// 클로즈 작업은 해주는것이 좋다.
		*/
		//JOptionPane 클래스
		//1.패키지: javax.swing
		//2.메소드
		//	1)showInpotDialog():입력 대화상자
		//	2)showConfirmDialog():확인 대화상자
		//	3)showMessageDialog():출력 대화상자
		//	주의) showInputDialog()는 언제나 String을 반환합니다. 쇼인풋다이아로그는 문자열로 반화돼있다는 의미
		
		/*
		 * String name = JOptionPane.showInputDialog("이름을 입력하세요."); String sAge =
		 * JOptionPane.showInputDialog("나이를 입력하세요."); String sHeight =
		 * JOptionPane.showInputDialog("키를 입력하세요."); String sGender =
		 * JOptionPane.showInputDialog("성별을 입력하세요.");
		 * 
		 * //String이 아닌 입력은 본래 타입으로 변환합니다. 
		 * int age =Integer.parseInt(sAge); double
		 * height =Double.parseDouble(sHeight); 
		 * char gender = sGender.charAt(0);
		 * 
		 * //출력 합시다. 
		 * String message = "이름:"+name+ 
		 * ",나이"+age+ "살,키:"+sHeight+
		 * "cm,성별:"+gender; 
		 * JOptionPane.showMessageDialog(null, message);
		 * JOptionPane - 표준화 간단한 대화 상자 :컴포넌트 출력 부모 컴포넌트
		 */	
		
		 /*
		  1. 
		  String a1 = JOptionPane.showInputDialog("정수1 입력:"); 
		  String a2 =JOptionPane.showInputDialog("정수2 입력:"); 
		  String a3 =JOptionPane.showInputDialog("정수3 입력:");
		  
		  int a5 =Integer.parseInt(a1); 
		  int a6 =Integer.parseInt(a2); 
		  int a7 =Integer.parseInt(a3);
		  
		  String message1 = "정수1값:"+a5+ "정수2값:"+a6+ 
		  "정수3값:"+a7+ "평균값:"+(a5+a6+a7/3);
		  JOptionPane.showMessageDialog(null, message1);
		 */
		/*
		2.
		String a1 = JOptionPane.showInputDialog("실수1 값 입력:");
		String a2 = JOptionPane.showInputDialog("실수2값 입력:");
		double a3 = Double.parseDouble(a1);
		double a4 = Double.parseDouble(a2);
		String message = "값 교환:"+(a3=a4);
		JOptionPane.showMessageDialog(null, message);
		*/
		/*
		3.
		String a1 = JOptionPane.showInputDialog("나이를 입력:");
		int a2 = Integer.parseInt(a1);
		String message = a2>=20 ? "성인":"미성년자";
		JOptionPane.showMessageDialog(null, message);
		*/
		
	}
}
