package _0709HighSchool;

public class Main {

	public static void main(String[] args) {
		
//		Student st = new Student(21110, "SW개발과", "상어");
//		Student_1 st1 = new Student_1(11111,"SW개발과", "고래");
//		Student_2 st2 = new Student_2(21110, "SW개발과", "상어");
//		Student_3 st3 = new Student_3(30900, "스마트과", "양");
		
		Student[] 학생들 = {
							new Student_1(11111,"SW개발과", "고래"),
							new Student_2(21110, "SW개발과", "상어"),
							new Student_3(30900, "스마트과", "양")
		};
		
		for(Student i : 학생들 ) {
			i.자기소개();
		}
	}

}
