package quiz06;

public class Customer {

	//field
	private int CustomerBread;
	private int CustomerMoney;
	
	
	//constructor
	public Customer(int CustomerMoney) {
		this.CustomerMoney =CustomerMoney;
	}
	//method
	public void buy(Bakery bakery,int money) {
		//bakery에서 판매한 빵과 잔돈을 받으면 됩니다.
		BreadAndChange bnc = bakery.sell(money);
		//구매처리
		CustomerBread += (bnc.getBread());
		CustomerMoney += (bnc.getChange());
		CustomerMoney -=money;
		System.out.println("빵"+CustomerBread+"남은돈"+CustomerMoney+"원");
	}
	
	//buy 출력 구매
	
}
