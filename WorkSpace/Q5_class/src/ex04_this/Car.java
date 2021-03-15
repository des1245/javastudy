package ex04_this;

	/*
	 *
	 */
public class Car {

	//field
	String model;
	String manufacturer;
	int price;
	void set(String model,String manufacturer,int price ) {
		this.model =model;
		this.manufacturer =manufacturer;
		this.price= price;
	}
	
	void info() {
		System.out.println("모델명:"+model);
		System.out.println("제조사"+manufacturer);
		System.out.println("가격:"+price+"만원");
	}
	
}
