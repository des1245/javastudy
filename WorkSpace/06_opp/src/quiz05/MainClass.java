package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me =new BankAccount("1111",10000); //통장 최초로 넣을때 넣은돈
		BankAccount you =new BankAccount("9999",10000); 
		
		//이체
		me.transfer(you,5000); //내가 너한테 보낸다. 5000원을 
		me.transfer(you,-100); // -100원 이체 불가능합니다.
		me.transfer(you,7000); //7000원 이체 불가능합니다.
		
		
		/*
		//입금
		me.deposit(10000);//내통장에 돈넣기 -만원 입금
		me.deposit(-10000);//마이너스 입근은 불가능 하게 하기
		
		//출금
		you.withdraw(5000); //5000원 출금
		you.withdraw(-100); //마이너스 출금은 불가능하게 합니다.
		you.withdraw(7000); //잔고 부족으로 불가능하다. 이것두 못하게 막아야 한다.
		*/
		//조회
		me.inquiry(); //계좌번호: 1111,잔액: 20000원
		you.inquiry(); //계좌번호: 9999, 잔액 5000원
		
	}
}
