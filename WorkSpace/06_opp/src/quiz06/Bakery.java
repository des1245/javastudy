package quiz06;

public class Bakery {
	//field
	private int breadCount;
	private int breadPrice;
	private int bakeryMoney;
	
	//constructor
	public Bakery(int breadCount,int breadPrice,int bakeryMoney) {
		this.bakeryMoney =bakeryMoney;
		this.breadCount =breadCount;
		this.breadPrice =breadPrice;
	}
	//method
	//1.판매 메소드
	//1)결과타입:BreadAndChange 판매를 했을때
	//2)메소드명:sell
	//3)매개변수:int money 빵이랑 잔돈받아서 주겠다는 의미
	BreadAndChange sell(int money) { //받은돈 나누기 money / breadPrice
		//판매빵개수
		int sellBread = money/breadPrice;
		//잔돈
		int change = money%breadPrice;
		//고객에게 돌려줄 BreadAndChage 생성
		BreadAndChange bnc =new BreadAndChange(sellBread,change);
			//Bakary의 판매처리
			bakeryMoney +=(money-change);
			breadCount -=(sellBread);
			//고객에게 빵과 잔돈 전달
			return bnc;
		}
		//2.info 이쪽은판매 출력
		public void info() {
			System.out.println("빠"+breadCount+"개,자본금"+bakeryMoney+"원");
	}
}

