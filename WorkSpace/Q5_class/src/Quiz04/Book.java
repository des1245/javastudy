package Quiz04;

public class Book {
	String title;
	String writer;
	int price;
	void set(String t,String n1,int p) {
			title =t;
			writer=n1;
			price=p;
		
	}
	void set(String t, String n1) {
		set(t,n1);
	}
	void set(String t,int p) {
		set(t,"미상",p);
	}
	void info() {
		String str ="제목:"+title+",저자"+writer+"가격:"+price+"원";
		System.out.println(str);
	}
}
