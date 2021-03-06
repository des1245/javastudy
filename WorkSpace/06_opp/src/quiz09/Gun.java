package quiz09;

public class Gun {
	
	//field
	//총기모델
	//들어가는 총알
	private String model;
	private int bullet;
	private final int FULL_BULLET=6;
	
	//constructor
	public Gun(String model,int bullet) {
		this.model=model;
		this.bullet = bullet;
	}
	
	
	//method
	public void shoot() { //총알 점검
		if(bullet>0) {
			bullet--;
			System.out.println(model+"빵야! ("+bullet+"발 남았다.");//총알이 있으면 빵야 아니면 총알이 남았다.
		}else if(bullet ==0) { //총알이 없을때
			System.out.println(model+"헛빵!");
		}
	}
	public void reload(int bullet){//장전
		if(this.bullet+bullet<=FULL_BULLET) { //현재 들어있는 총알 그러면 디스불렛으로 넣어서하면됀다.
			this.bullet+= bullet;
			System.out.println(model+"("+bullet+"발 추가되었다. 현재"+this.bullet); //this.bullet+= bullet; 새로장정된것 
		}else {
				int realBullet=FULL_BULLET- this.bullet;
//reload(int bullet)10발 경우  2      6           4
			this.bullet=FULL_BULLET; //아니면 고정시켜주는것
			System.out.println("("+realBullet+"발 추가되었다. 현재"+this.bullet+")");
			
		}
	}
	
	public void info() {
		System.out.println();
		System.out.println(model+"("+bullet+"발)");
	}


	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}	
}
