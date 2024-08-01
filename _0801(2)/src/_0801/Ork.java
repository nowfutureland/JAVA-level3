package _0801;

public class Ork extends Monster {
	
	int 분노;
	
	public Ork(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		분노 = 60;
		속성 = "풀";
	}
	
	@Override
	public void 자기소개() {
		super.자기소개();
		System.out.printf("분노:%d | 속성:%s\n",분노,속성);
	}
	
	void 공격(Hero 적) {
		자기소개(); 적.자기소개();
		
		int 특수공격력;
		
		if(분노 >= 100) {
			System.err.printf("%s가 화났다!\n",이름);
			특수공격력 = 공격력*2;
			분노 = 0;
		}else {
			특수공격력 = 공격력;
		}
		
		if(적.속성.equals("물")) {
			System.err.printf("물속성에게 효과가 굉장했다\n");
			System.out.printf("풀풀풀풀풀풀풀풀풀풀풀풀풀풀풀풀\n");
			System.out.printf("%s ▷ %s 공격!\n", 이름,적.이름);
			적.체력 -= 특수공격력*2;
		}else {
			System.out.printf("%s ▷ %s 공격!\n", 이름,적.이름);
			적.체력 -= 특수공격력;
			
		}
		
	}

}