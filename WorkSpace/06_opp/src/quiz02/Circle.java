package quiz02;

public class Circle { //이 서클은 포항 단계 처리를 상속에서도 할것이다.
	
	//field
	private Coord center; 
	private double radius;
	
	//constructor
	public Circle (Coord center,double radius) {
		this.center =center;
		this.radius =radius;
		//public Circle (Cood int x,int y,double radius)
		//this(new Coord(x, y),radius);
		//2번째 생성자 사이클에서 
	}
	public Circle(int x,int y,double radius) { 
		this.center = new Coord(x, y); // 인수전달된 쿨네이드메서ㄷ
		this.radius =radius;
	}
	
	//method
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	public void info() {
		System.out.print("중심 좌표");
		center.info(); //[0,0]
		System.out.println();
		System.out.print(",반지름:"+radius+", 넓이:"+getArea());
	}
}
