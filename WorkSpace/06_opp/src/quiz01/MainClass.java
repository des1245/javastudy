package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Watch watch = new Watch(10,45,30); //10시 45분 30초
	
		watch.addHour(25); //25시간 후 (1시간 후)
		watch.addMinute(61); //61분 후(1시간 1분 후) //이거 수정해봐야함 37분이 나와야하는데... 잘못나옴
		watch.addSecond(3661); //3661초 후(1시간 1분 1초 후)
		//3660초에서 1초붙었으니까 3661이 나온것 이다.
		
		watch.see(); //13시 47분 31초
		
		
	}
}
