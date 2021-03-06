package quiz10;

import java.text.DecimalFormat;

public class Lecture {

	private String lectureName;
	private Student[] students;
	
	//constructor
	public Lecture(String lectureName,String[] names) { //names에 렐처내임인수
		this.lectureName = lectureName;
		students =new Student[names.length]; //student[] 배열생성
		//각 학생 생성
		for(int i=0; i<names.length; i++) {
			students[i]=new Student(names[i]);
		}
	}
	//method
	public void exam(int scoreCount) {
		for(Student student:students) {
			student.setScores(scoreCount); 
		}
	}
	public double getLectureAverage() {//계산 별도로 만들어볼가한다. 강사님께서
	double total = 0.0;
	for(Student student: students) {
		total+= student.getAverage();
				
	}
	return total / students.length;
	}
	public void info() {
		System.out.println("강좌명:"+lectureName);
		System.out.println("강좌평균:"+new DecimalFormat("0.00").format(getLectureAverage()));
		System.out.println("====학생별 성적 현황 ====");
		for(Student student:students) {
			student.info();
			System.out.println("=======================");
		}
	}
}
