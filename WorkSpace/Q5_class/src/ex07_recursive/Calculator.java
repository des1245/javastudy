package ex07_recursive;

public class Calculator {
	
	//역활 : n! 값을 반환합니다.
	//3! (3팩토리얼) ==1 * 2 * 3
	public int getFactorial(int n) {
		//return 3*2*1
		if(n==1) {
			return 1; //n이나 1을 해도 같은 값이라서
		}else {
			return n * getFactorial(n-1);
		
		}
		//1이 나올때까지 5432까지 다 합한 값이 120이 나온것 이며, 1==1이면 
		//n은 120
	}
}
