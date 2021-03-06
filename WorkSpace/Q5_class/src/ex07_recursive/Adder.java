package ex07_recursive;

public class Adder {
	
	private int total; //0입니다.
	
	public void calculate(int n) {
		//10받아와서 
		if(n==0) { //10에서 0까지 내려오면서 0이랑 같으면 
			return; 
			//결과타입이 void인 경우에만 return;을 통해서 메소드 종료합니다.
		}
		
		total += n; //total=total+n; 10번 돌아서 합이 나온경우
		
		calculate(n-1); //10번 돌아가면서 마지막 조건문 0이 랑 많아면 
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
