package ex01_variable;

public class Ex05_castomg {

	public static void main(String[] args) {
		
		//casting: 다른 타입(자료형)으로 변환하는것
		
		//자동 형변환(promotion)
		System.out.println(1+1.5); //1+1.5->promotion으로 1.0+1.5 변환뒤 계산
		//데이터에 1.5에 데이터 훼손을 시키는것 그러니 1.0+1.5로 계산되게 된다.
		//자료형 변환의 우선순위
		//char->int->long->float->double->long double
		//강제 형변환(casting)
		int a = 1;
		double b =1.5;
		System.out.println(a+(int)b); //b를 잠시 int형으로 변환
		
	}

}
