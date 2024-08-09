package _0809;

public class Golem extends Monster{
	
	int 기력;

	public Golem(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		기력 = 20;
		속성 = "땅";
	}
	
	@Override
	void 자기소개() {
		System.out.printf("기력:%d | 속성:%s\n", 기력, 속성);
	}
	
	@Override
	void 공격(Hero 적) {
		자기소개(); 적.자기소개();
		기력 += 15;
		if(기력>=100) {
			체력 = 100;
			기력 = 0;
		}
		if(적.속성.equals("불")) {
			적.체력 -= 공격력*2;
			System.out.println("효과가 굉장했다");
		}else {
			적.체력 -= 공격력;
			System.out.printf("%s의 체력을 공격력 만큼 감소\n",적.이름);
		}
		자기소개(); 적.자기소개();
		
	}

}
