package _0709HighSchool;

public class Student_1 extends Student{
	
	protected boolean 영교시;
	
	Student_1(int 학번, String 학과, String 이름){
		super(학번,학과,이름);
		영교시 = true;
	}
	
	@Override
	protected void 자기소개() {
		super.자기소개();
		if(영교시==true) {
			System.out.printf("\n저는 1학년이라서 0교시를 합니다!*^*");		
		}
	}
	
	protected void 자격증() {
		System.out.println("\n저는 ITQ 한글, 엑셀, 파포를 취득했습니다.");
	}
}
