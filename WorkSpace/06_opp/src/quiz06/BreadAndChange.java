package quiz06;

public class BreadAndChange {
//빵이랑 잔돈 저장할수있는 체인지
	//field
	private int bread;
	private int change;
	
	//constructor
	public BreadAndChange(int bread,int change) {
		this.bread =bread;
		this.change=change;
	} //판매와 구매를 잔고 교환해주는 곳

	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	//method
	
}
