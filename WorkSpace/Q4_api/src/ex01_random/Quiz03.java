package ex01_random;

//3. 윷놀이
//"도",1칸 이동한다.
//"개",2칸 이동한다.
//"걸",3칸 이동한다.
//"윷","개", 6칸 이동한다.
//"모","모","도", 11칸 이동한다.
//도,개 나오면 던지는 횟수에서 반복분으로판단이 되게 된다.

public class Quiz03 {

	public static void main(String[] args) {
		
		String[] yut = {"도","개","걸","윷","모"}; //인덱스는 0~4이지만. 이동횟수는 5로 되있다.
		int move =0; //이동횟수는 인덱스 +1이다.
		
		while(true) {
		//윷을 프로그램이 던집니다.
		int idx =(int)(Math.random()*5)+0;//인덱스 0에서 5까지 랜덤
		System.out.println("\""+yut[idx]+"\"");
		
		//이동횟수 계산하니다.
		move +=(idx+1);
		
			//도,개,걸은 끝냅니다.
			if(idx<3) {
			System.out.println(","+move+"칸 이동합니다.");
			break;
			}
			//윳, 모는 또 던집니다.
			else {
				System.out.print(","); //윳던진거나 모던지거나 줄이 바끼면안되는거라서
			}
		}
	}
}
