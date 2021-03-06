package quiz04;

public class Gun {
	
	//field
	private String model;
	private int bullet;
	private final int FULL_BULLET=6;
	
	//construct(생성자)
	public Gun(String model,int bullet) { //("K2",2); 인수 전달
		this.model =model; //모델 K2
		this.bullet =bullet; //2발
	}
	
	//method 총알 먼저 쏘겠습니다.
	public void shoot() {
	if(bullet >0) { //2가 0보다 크냐 트루 감소 0이 돼면 거짓 다음것을 출력
		bullet--; //총알 하나써요. 그러면 나중감소시킨다.
		System.out.println("빵야!"+bullet+"발 남았다."); 
	}else {
		System.out.println("헛빵!");
	}
	}
	public void reload(int bullet) {//("K2",2) 2발 인수 받아온다.
		if(this.bullet+bullet<=FULL_BULLET) { //디스불렉+불렛 합쳐서 풀불렛보다 이하이면
			this.bullet+=bullet; //받아온총알이 
			System.out.println("발이 장전 되었다."+this.bullet+"발");
		}else {
			int realBullet=FULL_BULLET-this.bullet;//실제로 총알 장전수
			//       4         6         2
			this.bullet=FULL_BULLET; //실제들어간 총알
			System.out.println(realBullet+"발 장정된었다."+this.bullet+"발");
		
		}	
	}
	public void info() {
		System.out.println(model+"에"+bullet+"발 남았다.");
	}
}
