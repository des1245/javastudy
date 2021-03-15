package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {
		
		//6. 조건연산자(삼항연산자)
		// 조건식 ? true일 때: false일 때
		
		int score = 50;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		//문제1.평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor=80; //국어점수
		int eng=90; //영어 점수
		//String a = kor+eng/2 >85 ? "합격" : "불합격"; //1
		//System.out.println(a);
		
		boolean isPass =((kor+ eng)/2>=80)||(kor>=80 && eng>=80); //2
		//boolean isPass =(kor>=80 && eng>=80)||((kor+ eng)/2>=80);
		//평균구하는거 보다 편안하게 끝낼수있다면 kor>=80&&eng>=80이것이 더 편할것이다. 알아두기 참고
		System.out.println(isPass ? "합격":"불합격");
		//문제2. 2자리(10~99)점수 중에서 하나를 임의로 선언하고,
		//그 값이 '카프리카 수 '이면 "맞다",아니면 "아니다"
		//45,55,99가 카프리카 수입니다.
		int n=45; //카프리수를 자신을 제곱합니다. 45*45 => 2025 -> 20 25> 20+25->자신
		//String c = n *n == 20+25 ? "맞다" : "아니다.";  //1
		//System.out.println(c);
		
		int square = n*n; //Math.pow(n,2)==n*n //2
		int front = square / 100; //20.25 나오는데 20몫이며
		int end = square % 100; //20.25에서 25나온건 나머지이며 25이다.
		boolean isKaprekar = (n==front+end); // 45==45=20+25
		System.out.println(isKaprekar ? "맞다":"아니다"); // 
		
		
	}

}
