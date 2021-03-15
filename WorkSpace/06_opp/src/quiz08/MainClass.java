package quiz08;

public class MainClass {

	public static void main(String[] args) {
	
		Producer producer =new Producer();
		
		Singer singer1 =new Singer("alice", 1);
		Singer singer2 =new Singer("emily", 1);
		
		producer.produce(singer1, new Song("",""));
		producer.produce(singer1, new Song("",""));
		producer.produce(singer1, new Song("","")); //이거 실패할수있도록 작동해보기
		System.out.println("------------");
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		
		singer1.info();
		singer2.info();
	}
}
