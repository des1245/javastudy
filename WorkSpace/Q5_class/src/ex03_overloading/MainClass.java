package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		//직사각형을 만들어 봅니다.
		Rectangle nemo1 = new Rectangle();
		
		nemo1.set(-3,-4); //너비3,높이4
		//넓이 - 높이 | 를 호출해서 
		
		//하나를 처리하고 두번째도 두번째 처리하는것을 해야하면 셋을 작업을 해볼려구 한다.
		System.out.println("넓이:"+nemo1.getArea());
		
		//정사각형을 만들어 봅시다.
		Rectangle nemo2 =new Rectangle();
		nemo2.set(-3);
		System.out.println("넓이:"+nemo2.getArea());
		
		//마이너스 존재할수없다는 가정하에 넓이가 다 0으로 나오게 하는것
	}
}
