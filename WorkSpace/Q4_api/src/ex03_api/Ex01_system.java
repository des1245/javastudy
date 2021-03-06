package ex03_api;

public class Ex01_system {
	public static void main(String[] args) {
		
		//1.시스템 종료
		//System.exit(0); 이거 살려놓으면 아래거 실행이 안된다.
		
		//2. 현재 시간(타임스탬프) 알아내기
		//timestamp:1970-01-01 0:00:00 부터 현재까지 경과한 
		//시간(단위: 밀리초) 천분의 1초 -> 1/1000
		
		long timestamp = System.currentTimeMillis();
		//60*60*24*360 이것 시간계산 1년의 기준 시간을 찾아내기
		//currentTimeMillis() 현재시간을 밀리세컨드로 만들어 달라는 의미
		System.out.println(timestamp);
		
		//3. 현재 시간 알아내기
		//	  자바가 마음대로 결정한 기준일로부터 경과한 시간(단위:나노초(1/10억))
		/*
		 *  어떠한 시간<-
		 *    |
		 *   작업      이 작업 시간을 얼마나 투자해서 나온 결과인지 필요할때 쓰이는것
		 *    |
		 *  어떠한 시간<-
		 */
		long something =System.nanoTime();
		//System.nanoTime() 경과된 시간을 측정하는 용도
		System.out.println(something);
		
		//4.배열 복사하기
		int[] a= {1,2,3,4,5};
		int[] b= new int[10];
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a,0,b,0,a.length);
		//a,0,b,1 두개를 묶기 a[0]에서b[0]로 복사 즉,a의 0로있는걸 b로 제로넣은것
		//a.length만큼 복사 작업을 반복 수행 a.length 5개를 복사하라는 것
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//배열 어레이 복사본(Object src,intsrcPos,객체 대상,포스 안에,길이)
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		//포문에 0부터 시작해서 b배열 크기1추가하면 1하나식 10공간에서 인덱스는 0인 널값남기고
		//인덱스가 밀려나면서 a메모리값이 밀려나가는게 보인다.
 	}
}
/*
System.arraycopy(src, srcPos, dest, destPos, length);
했던 부분 System.arraycopy(a,0,b,0,a.length);

지정한 위치에서 시작하여 지정한 소스 배열의 배열을 대상 배열의 지정된 위치로 복사합니다.
일련의 어레이 구성 요소는 src에서 참조하는 소스 어레이에서 대상 어레이에서 
참조하는 대상 어레이로 복사됩니다. 복사한 성분 수가 길이 인수와 같습니다. 소스 어레이의 
위치 srcPos에서 srcPos+length-1까지의 구성 요소는 각각 대상 어레이의 destPos+length-1을
 통해 destPos로 복사된다.
src 및 dest 인수가 동일한 어레이 개체를 참조하는 경우, srcPos+length-1 위치의 구성 
요소가 먼저 길이 구성 요소를 포함하는 임시 배열로 복사된 다음 임시 배열의 
내용이 대상 배열의 destPos+length-1을 통해 destPos 위치에 복사된 것처럼 복사가 수행됩니다.

대상이 null인 경우 NullPointer예외가 발생했습니다.

src가 null인 경우 NullPointer예외가 발생했지만 대상 배열은 수정되지 않았습니다.

그렇지 않으면 다음 중 하나라도 참이면 ArrayStoreException이 발생하며 대상은 수정되지 않습니다.
■ src 인수는 배열이 아닌 객체를 말합니다.
■ 데스트 인수는 배열이 아닌 객체를 말합니다.
■ src 인수와 dest 인수는 구성요소 유형이 서로 다른 원시 유형을 가진 배열을 참조합니다.
■ src 인수는 원시 구성요소 유형을 가진 배열을 의미하며, 대상 인수는 참조 구성요소 유형을 가진 배열을 나타냅니다.
■ src 인수는 참조 구성요소 유형을 가진 배열을 의미하며, 대상 인수는 원시 구성요소 유형을 가진 배열을 나타냅니다.

그렇지 않으면 다음 중 하나라도 참이면 IndexOutOfBoundsException이 던져지고 대상은 수정되지 않습니다.
■ srcPos 인수는 음수입니다.
■ destPos 인수는 음수입니다.
■ 길이 인수는 음수입니다.
µsrcPos+ 길이가 소스 어레이의 길이인 src.length보다 큽니다.
➡destPos+ 길이가 대상 배열의 길이인 dest.length보다 큽니다.

그렇지 않으면 srcPos 위치에서 srcPos+length-1까지의 소스 어레이의 실제 구성 요소를 
할당 변환을 통해 대상 어레이의 구성 요소 유형으로 변환할 수 없는 경우 ArrayStoreException이 
발생합니다. 이 경우 src[srcPos+k]를 대상 어레이의 구성 요소 유형으로 변환할 수 없도록 길이보다 
작은 음수가 아닌 최소 정수로 설정합니다. 예외를 던졌을 때 srcPos+k-1에서 srcPos+k-1을 통해 
소스 어레이 구성 요소가 이미 대상 어레이 위치 Pos에 복사되었습니다.o 대상 배열의 다른 위치가
 수정됩니다.(이미 항목별로 분류된 제한사항 때문에, 이 문단은 두 배열이 모두 참조 유형인 구성요소 
 유형을 가지는 상황에만 효과적으로 적용됩니다.)
매개 변수:src - source array.srcPos - source array.dest - destination array.destPos - destination data.length의 시작 위치 - 복사할 배열 요소의 수입니다.Throps:IndexOutOfBoundsException - 복사를 수행하면 어레이 한계를 벗어난 데이터에 액세스할 수 있습니다.ArrayStoreException - 유형이 일치하지 않아 srarray의 요소를 대상 어레이에 저장할 수 없는 경우.널 포인터예외 - src 또는 대상이 null인 경우
*/