package ex01_branch;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
		/*
		예4
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단계(1~4)입력 >>>");
		int step =sc.nextInt();
		
		switch(step) {
		case 1: System.out.println("기");
		case 2: System.out.println("승");
		case 3: System.out.println("전");
		case 4: System.out.println("결");
		break;
		default: System.out.println("알 수 없음");
		}
		sc.close();
		*/
		/*
		 예3
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이 입력 >>>");
		int age =sc.nextInt();
		
		switch(age/10){
		case 0: //age 1~9
			//System.out.println("미성년자"); 따로 나누지 않고 합치면 
			//break; 19살이면 미성년자 아니면 합쳐서 21살이면 성인으로 케이스2번이 된다.
		case 1: //age 10~19
			System.out.println("미성년자");
			break;
		case 2: //age>=20
			System.out.println("성인");
			break;
		}
		*/
	
		
		/*
		 3. 1.스테이트 있을때 방법
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이 입력 >>>");
		int age =sc.nextInt();
		
		int state =0; //미성년자를 의미
		if(age >=20) {
			state =1; //성인을 의미
		}
		switch(state){
			case 0:
				System.out.println("미성년자");
				break;
			case 1:
				System.out.println("성인");
				break;
		}
		*/
		/*
		 예2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 >>>");
		int age =sc.nextInt();
		if(age<1||age>100) {
			System.out.println(age+"살은 불가능한 나이입니다.");
		}else if(age<=7) {
			System.out.println(age+"살은 미취학 아동 입니다.");
		}else if(age<=13) {
			System.out.println(age+"살은 초등학생 입니다.");
		}else if(age<=16) {
			System.out.println(age+"살은 중학생 입니다.");
		}else if(age<=19) {
			System.out.println(age+"살은 고등학생 입니다.");
		}else {
			System.out.println(age+"살은 성인 입니다.");			
		}
		sc.close();
		*/
		/*
		 예1
		Scanner sc= new Scanner(System.in);
		
		System.out.println("양수 입력 >>>");
		int n = sc.nextInt();
		
		if(n%3==0) {
			System.out.println(n+"은(는) 3의 배수 입니다.");
		}else if(n%2==0) {
			System.out.println(n+"은(는) 짝수 입니다.");
		}else {
			System.out.println(n+"은(는) 홀수 입니다.");
		}
		sc.close();
		*/
		/*
		4.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력:");
		int num =sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("기승전결");
			break;
		case 2:
			System.out.println("승전결");
			break;
		case 3:
			System.out.println("전결");
			break;
		case 4:
			System.out.println("결");
			break;
		default :
			System.out.println("알수없음");
		}
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이:");
		int num = sc.nextInt();
		
		switch(1) {
		case 1:
			System.out.println(num>=20?"성인":"미성년자");
			break;
		}
		*/
		/*
		 2.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이:");
		int num = sc.nextInt();
		if(num<=7) {
			System.out.println("7이하:미취학 아동");
		}else if(num<=13) {
			System.out.println("13이하:초등학생");
		}else if(num<=16) {
			System.out.println("16이하:중학생");
		}else if(num<=19) {
			System.out.println("19이하:고등학생");
		}else if(num>=20) {
			System.out.println("20이상:성인");
		}else {
			System.out.println("나의 범위(1~100)를 벗어나면:불가능한 나이");
		}
		*/
		/*
		 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력:");
		int num = sc.nextInt();
		
		if(num%3==1) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		*/
		/*
		if(true) {
			System.out.println("만족합니다.");
		}
		if(false) {
			System.out.println("불만족합니다.");
		}
		
		int score =60;
		
		//80이상 :"상",79~60 :"중", 59이하: "하"
		
		
		if(score>= 80) 
		{
			System.out.println("상");
		}
		else
		{
			if(score>=60)
			{
				System.out.println("중");
			}
			else
			{
				System.out.println("하");
			}
		}
		
		if(score >=80)
		{
			System.out.println("상");
		}
		else if(score>=60)
		{
			System.out.println("중");
		}
		else
		{
			System.out.println("하");
		}
		/*
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
	}

}
