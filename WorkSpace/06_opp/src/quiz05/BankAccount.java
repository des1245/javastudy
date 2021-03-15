package quiz05;

public class BankAccount {

	//field
	private String accNo; //계좌넘버
	private long balance; //잔고를 밸런스 int로 하면 21억이 끝이라 롱타입으로 하는것
	
	//생성자
	public BankAccount(String accNo,long balance) {
	this.accNo = accNo;
	this.balance=balance;
	}
	
	//method
	public void deposit(long money) {
		if(money <=0) {
			System.out.println(money+"원은 입금할 수 없습니다.");
			return; //디파싯은 더이상 처리를 안한다.  리턴해주면 그렇게 됌
		}
		balance+= money; //밸런스 잔고에서 증가 시켜주자
	}
	//실제로 출금된 금액을 반환하는 메소드
	public long withdraw(long money) { //long money :요청 금액
		if(money<=0) {
			System.out.println(money+"원은 출금할 수 없습니다.");
			return 0; // 0이라서 출금이 없음
			//리턴 반환 할때 값이 없으면 반환해야한다.
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance-= money; //밸런스 잔고에서 빼주자.
		return money;
	}
	
	/*
	 1.
	public void withdraw(long money) {
		if(money<=0) {
			System.out.println(money+"원은 출금할 수 없습니다.");
			return;
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance-= money; //밸런스 잔고에서 빼주자.
	}
	*/
	public void inquiry() {
		System.out.println("계좌번호:"+accNo+"("+balance+")");
	}
	public void transfer(BankAccount you,long money) { //자기가 쓸려는 클래스 쓸려니까 좀 난감;;; 쓰는데 지장없음
		/*
		 * balance출력이 머니에서 다나오는게아니라는것
		//내 돈은 줄어 든다. (출금)
		withdraw(money);
		//네 돈은 늘어난다. (입금)
		you.deposit(money);
		내 통장에서 출금된 금액을 네 통장에 입금해 준다.
		*/
		//내통장에서 나간것 제일안쪽부터 처리하고 바같쪽 처리
		 //출금에서 실패하면 0, 내통장에서 출금돼면 0을 반환시켜준다.
		you.deposit(withdraw(money));
		//뱅크 클래스 you(입금(출금(머니))) you는 출력 에서 조회해주는것
	}
	/*
	풀다가만 상태
	public void transfer(String accNo,int money) {
		if(5000<=0) {
			System.out.println(accNo+"5000원을 이체 한다.");
			balance+=money;
		}else if (money> balance) {
			System.out.println("이체가 불가능합니다.");
			balance-= money;
		}else {
			System.out.println("불가");
		}	
	}
	*/
	
	
	/*
	 하다가 만거
	public void deposit(long balance,String accNo) {
		if(this.balance<10000) {
			System.out.println(accNo+"님"+balance+"만원 입금 되었습니다.");
		}else {
			System.out.println("마이너스 입니다.");
		}
	}
	public void withdraw(long balance,String accNo) {
		if(this.balance<5000) {
			
			System.out.println(accNo+"님"+balance+"만원 출금 되었습니다.");
		}else if(this.balance) {
			//여기부분 아직 출력 마이너스 계산 아직 못했음
		}else {
			System.out.println("잔고 부족으로 불가능합니다.");
		}
	}
	*/
}
