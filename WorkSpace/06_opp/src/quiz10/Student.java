package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	//field
	private String name;
	private int[] sores;	//점수들
	private  double average;	//평균
	private char grade;	//학점(A~F)
	private boolean isPass;	//합격유무(평균 60이상 "합격")
	//스코어즈는 자동으로 나오는 데이터들이다. 
	
	//constructor
	public Student(String name) {
		this.name =name;
	}
	//method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSores() {
		return sores;
	}

	public void setSores(int[] sores) { 
		this.sores = sores;
	}
	public void setScores(int scoreCount) {
		//scoreCount만큼 임의의 점수를 scores 배열에 저장
		//30% 확률:0~50 임의로 생성
		//40%확률 :50~79임의로 생성
		//30% 확률:80~100 임의로 생성
		sores =new int[scoreCount];
		for(int i=0; i<sores.length; i++) {
			if(Math.random()<0.3) { //30%에 50정수
				sores[i]=(int)(Math.random()*50)+0;
			}else if (Math.random()<0.7) {
				sores[i]=(int)(Math.random()*30)+50;
			}else {
				sores[i]=(int)(Math.random()*21)+80;
			}
		}
		//평균 구하기
		int total=0; //평균 구하지말고 합계로 구해야한다고 했다.
		for(int score : sores) {
			total+=score; //합계
		}
		double average =(double)total / sores.length;
		setAverage(average); //캐스팅 우선순위  그다음 나누기
		//학점 구하기
		setPass(true);//초기화는 합격
		if(average>=90) {setGrade('A');}
		else if (average>=80) {setGrade('B');}
		else if (average>=70) {setGrade('C');}
		else if (average>=60) {setGrade('D');}
		else {setGrade('F'); setPass(false);} //setPass를 다시 초기화를 해서 트루를 다시 펄스로 바꿔주는방법
		//그냥 메소드 프라이벳 주는것이 낮다. 좀더 안정성을 위해
	}
	public double getAverage() {
		return average;
	}

	private void setAverage(double average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isPass() {
		return isPass;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("점수:"+Arrays.toString(sores)); //[50,72,95,84,60] //Arrays.toString(a) 정수배열을 문자배열로 바꿔주는것
		System.out.println("평균:"+new DecimalFormat("0.00").format(average) +"점"); //소수 2자리 까지만 출력 DecimalFormat("0.00") 숫자에 자릿수
		System.out.println("학점:"+grade+"학점"); 
		System.out.println(isPass ? "합격":"불합격"); 
	}
}
