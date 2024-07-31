package _0731;

public class Golem extends Monster {
	
	int 기력;
	
	public Golem(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		기력 = 20;
		속성 = "땅";
	}
	
	@Override
	void 자기소개() {
		super.자기소개();
		System.out.printf("기력:%d | 속성:%s",기력,속성);
	}
	
	void 공격(Hero 적) {
		자기소개(); 적.자기소개();
		
		int 특수공격력;	
		기력 += 15;
		
		if(기력 >= 100) {
			System.err.printf("%s가 체력 회복!",이름);
			체력 = 100;
			기력 = 0;
		}
		
		if(적.속성.equals("불")) {
			System.err.printf("불속성에게 효과가 굉장했다\n");
			System.out.printf("풀풀풀풀풀풀풀풀풀풀풀풀풀풀풀풀\n");
			System.out.printf("%s ▷ %s 강한공격!\n", 이름,적.이름);
			적.체력 -= 공격력*2;
		}else {
			System.out.printf("%s ▷ %s 공격!\n", 이름,적.이름);
			적.체력 -= 공격력;
		}
	}
}