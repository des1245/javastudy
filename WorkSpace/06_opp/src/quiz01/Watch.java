package quiz01;

public class Watch {
	private int hour;
	private int minute;
	private int second;
	
	//constructor
	public Watch(int hour, int minute,int second) {
		this.hour =hour;
		this.minute=minute;
		this.second=second;
	}
	//method
	public void addHour(int hour) {
		this.hour+=hour;
		this.hour %= 24; // hour지금 이값에 들어간 나머지가 1인것 = hour(25) % 24
	}
	public void addMinute(int minute) { //1시간 61
		//addHour에서 1시간 가져가라 남는건 내가 가지겠다는것
		//완성된 메소드를 재활용 하면 
		this.minute+=minute;
		int hour =minute /60; //hour =61/60
		addHour(hour);
		this.minute %=60; //minute = 61 %60;
	}
	public void addSecond(int second) {
		this.second +=second; 
		int minute =this.second /60;
		addMinute(minute);
		this.second %=60;
	}
	public void see() {
		System.out.println(hour+"시"+minute+"분"+second+"초");
	}
}
