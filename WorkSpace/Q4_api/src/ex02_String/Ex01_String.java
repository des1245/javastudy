package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		
		//1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에
		//	"apple"이 하나만 생깁니다.
		String a="apple"; //a의15번지 apple들어간다는것
		String b="apple"; 
		//a와b는 같은 상태이구 메모리로는 a의 15번지 애플들어가
		//있지만 b의 15번지에 들어가있는것 a번지랑 b번지가 다르게 들어가있는것
		System.out.println(a==b); //참조비교(주소비교) 한번만든 리터럴은 재활용한다.
		
		//2. new는 무조건 새로 만듭니다.
		//	"banana"는 2개가 있습니다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c==d); //참조 비교 (주소비교) 메모리 c의랑 d주소가 다르게 
		//되어있어서 그렇다.
		
		//3. 문자열의 길이는 length() 메소드로 구합니다.
		System.out.println(a.length()); //5
		
		//Quiz01했던상황 다음
		//4.문자열의 일부를 추출하는 경우에는 substring() 메소드를 사용합니다.
		//1)substring(시작인덱스):시작인덱스 부터 끝까지 추출합니다.
		//2)substring(시작인덱스,종료인덱스):시작인덱스<= 추출한 문자열
		//지금 apple app빼보기
		System.out.println(a.substring(0, 3));
		//비긴 시작0 엔드3 -> 0 1 2
		//app(사용인덱스 :0,1,2)
		
		//5.문자열 양 옆의 공백문자(white space)를 제거하려면 trim()메소르를 사용합니다.
		String name="     alice      ";
		System.out.println(name.trim().length());
		//공백을 빼고 길이를구하는 용도
		//name.trim() 이거만 출력하면 alice 공백없에고 나오지만
		//name.trim().length() 이렇게 하면 공백을 없애고 길이로 나온다.
		
		//6.특정 문자를 찾는 경우에 indexOf() 메소드를 사용합니다.
		//  찾고자 하는 문자(문자열)의 인덱스를 반환합니다.
		String str ="best of best of best";
	
		System.out.println("첫 번째 best의 인덱스:"+str.indexOf("best"));
		//처음부터 best 검색하게 됍니다.
		System.out.println("두 번째 best의 인덱스:"+str.indexOf("best",4));
		//인덱스의 4부터 검색을 해준다. 첫베스트부터다음베스트에서까지가 인덱스8이 나온것 이다.
		//예 best of b
		//  012345678 그래서 인덱스8이 나온 것
		
		System.out.println("두 번째 best의 인덱스:"+str.indexOf("best")+1);
		//첫번째 베스트부터 위치를 먼저 찾아서 구하고 인덱스로 0이랑 1이 베스트가 나온것이다.
		//str.indexOf 문자열 파싱 하는 기능 이다.
		System.out.println("찾는 문자(열)이 없으면"+str.indexOf("v"+"이 나타납니다."));
		//없으면 -1입니다.
		
		//7.뒤에서 부터 검색하는 lastIndexOf()메소드가 있습니ㅏㄷ.
		System.out.println(""+str.lastIndexOf("best"));
		//String str ="best of best of best";
		//             012345678910111213141516 마지막은 b까지 오면 16이 나온다.
		//8. 기존 문자를 새로운 문자로 변경하는 replace() 메소드가 있습니다.
		System.out.println(str.replace("b","B"));
		//모든 문자열을 찾아서 수정하고 싶은 경우 소문자를 대문자로 변경 시키는것
		System.out.println(str.replace("f",""));
		//뉴캐릭터에 빈문자열 시작되더라두 f를 지워 버리겠다는 말
		//파일 업로드를 할때 공백자리에 +를 넣어서 하는 방법도 있다. 모모모+모모모이렇게 되는 경우가 있다는말
		
		//레귤러 익스프레션 정규식 배울때 그때 쓸수 있을것 이다.
		
	}
}
