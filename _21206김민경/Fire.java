package _21206김민경;

public  class Fire extends Poketmon {
	
	int 불공격력;
	int 공격처리;
	private String 물;
	
	public Fire(String 이름, int 체력, int 속성) {
		super(이름, 체력, 속성);
		속성 = 불공격력;
		공격력 = 공격력계산(불공격력);
		
	}
	
	@Override
	int 공격력계산(int 특수공격력) {
		공격력 += 특수공격력;
		return 공격력;
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
		if(적.속성==물) {
			공격력 = 0;
		}else {
			적.체력 = 공격력*2; 
		}
		자기소개();
		적.자기소개();
	}
	

}
