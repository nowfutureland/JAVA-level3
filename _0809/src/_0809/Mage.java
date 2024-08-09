package _0809;

public class Mage extends Hero{
	
	int 마나;
	
	public Mage(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		공격력 = 공격력계산();
		마나 = 30;
		속성 = "물";
	}
	
	int 공격력계산() {
		return 공격력 +=5;
	}
	
	@Override
	void 자기소개() {
		System.out.printf("마나:%d | 속성:%s\n", 마나, 속성);
	}

	@Override
	void 공격(Monster 적) {
		자기소개(); 적.자기소개();
		System.out.printf("%s를 공격합니다\n",적.이름);
		적.체력 -= 공격력;
		마나 += 15;
		자기소개(); 적.자기소개();
	}
	
	int 특수공격력;

	@Override
	void 특수공격(Monster 적) {
		자기소개(); 적.자기소개();
		
		if(마나>=100) {
			특수공격력 = 공격력*3;
			마나 = 0;
		}else {
			특수공격력 = 공격력;
		}
		
		if(적.속성.equals("불")) {
			적.체력 -= 특수공격력*3;
			System.out.printf("%s의 체력을 3배 감소\n",적.이름);
		}else {
			System.out.println("특수공격에 실패");
		}
		자기소개(); 적.자기소개();
		
	}

}
