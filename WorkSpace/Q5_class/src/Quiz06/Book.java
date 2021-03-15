package Quiz06;

public class Book {
	
	String  title; //필드 타이틀
	String  writer;
	int price;
	
	Book(String title,String writer,int price){
		this.title=title; //this.title
		this.writer=writer;
		this.price=price; 
		//인스턴스 멤버란 인스턴스 
	}
	Book(String title, int price){
		this(title,"미상",price);
	}
	Book(){
		//this("없음","미상",0);
		this("없음",0);
	}
	void info() {
		String str ="제목:"+title+",저자:"+writer+"가격:"+price;
		System.out.println(str); // 이부분은 원래 후반가서 잘하고 싶어서 써먹으면 
		//이해 돼지만 그것두 아니면 구지 많이 쓰일일은 없다.
	}
	
}
