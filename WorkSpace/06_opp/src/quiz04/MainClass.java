package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun =new Gun("K2",2); //모델명,현재 들어가있는 총알몇개냐?
		//총을 하나 만든다.
		Soldier soldier =new Soldier("람보",gun); //가지고 있는 총을 가지고있어요.
		
		//생성자 집중해서만들기! 위에거 2개
		
		soldier.shoot();//빵야! 1발 남았다.
		soldier.shoot();//빵야! 0발 남았다.
		soldier.shoot();//헛빵!
		
		//여기부분 조금 생각해보면서 해봐야할곳
		
		soldier.reload(2); //2발이 장전 되었다. 현재 2발.
		soldier.reload(6); //실재로 장전 4발 왜냐 하면 최대 6발이라서 현재 6발
		soldier.reload(6); //0발이 장전 되었다. 현재 6발
		
		soldier.info(); //이름은 람보 6발남았다.
		
		//솔져는 총을 가지고있는게 아니라 총을 줄여주는것
		//건을 넘어가서 건은 작업해주고 
		

	}
}
