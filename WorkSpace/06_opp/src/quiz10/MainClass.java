package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		String[] name = {"블레드","짱구","타요","띠띠뽀","자두"};
		//학생의 이름
		Lecture lecture = new Lecture("스프링프레임 워크",name); //이5명의 스프링 프레임 워크 듣는다.
		lecture.exam(3); //시험을 봅니다. setScores()가 호출됩니다.
		//어디서 정해줘야 하는 데이터 이다
		lecture.info(); //학생 정보 출력+ 강좌 전체 평균
		
	}
}
