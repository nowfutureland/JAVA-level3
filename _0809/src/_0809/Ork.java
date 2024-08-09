package _0809;

public class Ork extends Monster{
	
	int 분노;

	public Ork(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		분노 = 60;
		속성 = "풀";
	}
	
	@Override
	void 자기소개() {
		System.out.printf("분노:%d | 속성:%s\n", 분노, 속성);
	}

	int 특수공격력;
	
	@Override
	void 공격(Hero 적) {
		자기소개(); 적.자기소개();
		분노 += 10;
		if(분노>=100) {
			특수공격력 = 공격력*2;
			분노 = 0;
		}else {
			특수공격력 = 공격력;
		}
		if(적.속성.equals("물")) {
			적.체력 -= 특수공격력*2;
			System.out.println("효과가 굉장했다");
		}else {
			적.체력 -= 특수공격력;
			System.out.printf("%s의 체력을 특수공격력 만큼 감소\n",적.이름);
		}
		자기소개(); 적.자기소개();
		
	}

}
