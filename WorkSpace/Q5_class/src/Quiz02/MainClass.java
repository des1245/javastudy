package Quiz02;

public class MainClass {

	public static void main(String[] args) {
	Calculator calc;	//객채가 없고 참조변수만 만든상태
	
	//객체를 만드는 명령은 "new" 입니다.
	
	calc =new Calculator(); //이때 객체가 만들어진다. 그 참조 값이 calc에 전달됩니다.
							//객체가 만들어지는 시점을 "인스턴스화" 되었다고 합니다.
	
	calc.addtion(1, 2); //에디션에 출력메소드가 만들어져 있어서 출력 결과가 나온것이다.
	
	int a = 10;
	int b = 5;
	
		if(a>=b) {
			System.out.println(a+"-"+b+"="+calc.subtraction(a, b)); 
			//calc.subtraction(a, b) 여긴 인수
		}else {
			System.out.println(b+"-"+a+"="+calc.subtraction(a, b));
		}
	}
}
