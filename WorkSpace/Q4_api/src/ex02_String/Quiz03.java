package ex02_String;

// 3.파일명과 확장자명을 분리하기 이건 할줄 알아야 하는것

public class Quiz03 {
	public static void main(String[] args) {

		String fullname="2021-03-10.jpg";
		int idx =fullname.lastIndexOf(".");
		String filename=(fullname.substring(0,idx)); //2021-03-10 확장자명
		String extname =(fullname.substring(idx+1)); // jpg 확장자명
		System.out.println("파일명:"+filename);
		System.out.println("확장자명:"+extname);
	}
}
