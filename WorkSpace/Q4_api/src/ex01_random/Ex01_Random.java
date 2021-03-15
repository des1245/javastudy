package ex01_random;
//랜덤에서 게임으로 활용할때도 있음
/*
 * 1. 임시비밀번호 발급하기
 * 영문대문자 + 아리비아 숫자 6자리
 * 약5:5
 */
import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		//방법2
		//문자 == 정수
		//'0'~'9'==48~57
		//'A'==65
		//'a'==97 //아스키코드는 쓰이지는 않을것 이다.
		
		String tempPw2 ="";
		
		for(int n=0; n<6; n++) {
		if(Math.random()<0.5) {
		int arabia =(int)(Math.random()*10)+'0'; //48쓰지 말구'0'이라고 쓰기 48이랑 비슷한것 이라서 48부터 10개중에 랜덤주겠다는것
		tempPw2 += (char)arabia;
		}else {
		int alphabet =(int)(Math.random()*26)+'A'; //A에서 Z사이까지 문자가 나온다.
		tempPw2 +=(char)alphabet;
		}
	}// 임시 비번 만들기 몇번 4장 api에 어디에 있다. 안적어 두면 찾기 힘들다. 그러니 주석 잘 정리 해두기 
		System.out.println(tempPw2);
		/*
		//방법1
		char[] charSet= {
				'0','1','2','3','4','5',
				'6','7','8','9','A','B',
				'C','D','E','F','G','H',
				'I','J','K','L','M','N',
				'O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'
				//한번 만들어 두면 관리하기 쉬운편
		}; //5:5는 없구 일반화 시킨것 문자 선언 부분된것 위에거지금 '0'이런것
		
		//인덱스를 랜덤하게 생성합니다. 0<=random<charSet.length
		String tempPw=""; //문자열을 출력하기 목적 빈문자열로 해주기
		for(int n=0; n<6; n++) { //6번 반복을 의미합니다.
			int idx = (int)(Math.random()*charSet.length)+0; //0에서 35개에서 랜덤으로 나온다.
			
			tempPw += charSet[idx];
		} 
		//이러한 코드를 신경 쓰는 것보다 만드는것에 신경을 써두는게 좋다. 이러한 메일 못 보내서
		//그러지 않기를 ㄷㄷ
		System.out.println(tempPw);
		/*
		//java.util.Random 생성 클래스
		Random random = new Random();
		
		//1.int 난수 - 생성되는 정수값
		int rand1 =random.nextInt();	//int 범위 중 하나
		int rand2 =random.nextInt(10);	//10개 중 하나 0~9까지 <-임의의 데이터 딱!
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		//2.double 난수
		double rand3=random.nextDouble(); //0 <=생성되는 난수 <1 힌트! 0.얼마 0에서 1을 넘지 않는다.
		System.out.println(rand3); //0% <= 난수<100% 0퍼센트 <=난수<100% 활용 처리를 게임에서도 활용할때 쓰인다.
		//하지만 이 랜덤 클래스는 잘안쓰인다.
		*/
	}
}
