package quiz04;

public class Soldier { 
	//두번재는 이름하고 총을 가지고있다. 
	private Gun gun;
	private String name;
	
	//constructor
	public Soldier(String name,Gun gun) {
	this.name=name;//현재 군인에 이름 받아오기
	this.gun =gun; //현재 총에 이름 받아오기
	}
	
	//method
	public void shoot() { //이건 군인이 쏘는건데 
		gun.shoot(); //실제 보면 건이 쏘고있는것
	}
	public void reload(int bullet) { //불릿을 받아와서 
		gun.reload(bullet); //총 장전해 준다.
	}
	public void info() {
		System.out.println(name+",");
		gun.info();
	}
}
