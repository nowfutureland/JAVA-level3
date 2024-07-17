package _21206김민경;

public class water extends Poketmon {
	
	int 물공격력;
	int 공격처리;
	private String 불;

	public water(String 이름, int 체력, int 속성) {
		super(이름, 체력, 속성);
		속성 = 물공격력;
	}

	@Override
	void 공격(Poketmon 적) {
		자기소개();
		적.자기소개();
		공격처리 = 적.체력 - 공격력;
		자기소개();
		적.자기소개();
	}

	@Override
	void 특수공격(Poketmon 적) {
		자기소개();
		적.자기소개();
		if(적.속성==불) {
			적.체력 = 공격력*3;
			System.out.println("적 체력을 3배 감소");
		}else {
			적.체력 = 공격력 * 2;
			System.out.println("적 체력을 2배 감소");
		}
		자기소개();
		적.자기소개();
	}

	@Override
	int 공격력계산(int 특수공격력) {
		공격력 += 특수공격력;
		return 공격력;
	}

}
