package Quiz03;

public class Student {
	
	//자바파일 하나당 클래스 하나 클래스를 메인이랑 한번에 합치는것은 비추이다. 하면
	//겹치는 경우가 잇어서 그렇다 그래서 클래스 하나당 하나로 한것
	
	//field
	String name;
	int kor,eng,mat;
	
	//method
	void set(String n,int k,int e,int m) {
		name=n;
		kor =k;
		eng =e;
		mat =m;
	}
	double getAverage() { //전달이 없으니 저장할것두 없다.
	return (kor+eng+mat)/3.0;
	}
	//겟 에버리즈 에서 합한것을 아래로 출력 전달 할수 있다.
	String getPass() {
		return getAverage()>=60 ? "합격":"불합격";
	}
}
