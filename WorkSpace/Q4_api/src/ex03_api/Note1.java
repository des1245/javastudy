package ex03_api;

public class Note1 {

	public static void main(String[] args) {
		long imtestamp =System.currentTimeMillis();
		
		long something =System.nanoTime();
		System.out.println(something);
		
		int[] a= {1,2,3,4,5};
		int[] b= new int[10];
		
		System.arraycopy(a, 0, b,0, a.length);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//배열 어레이 복사본(Object src,intsrcPos,객체 대상,포스 안에,길이)
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
