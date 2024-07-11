package _0711;

public class Mage extends Hero {

	int 마나;
	
	public Mage(String 이름, int 체력, int 공격력) {
		super(이름, 체력, 공격력);
		마나 = 40;
	}
	
	public int get마나() {
		return 마나;
	}

	public void set마나(int 마나) {
		this.마나 = 마나;
	}

	@Override
	void 자기소개() {
		System.out.printf("마법사 %s의 정보, 체력:%2d, 공격력:%2d, 마나:%2d \n",
				이름, 체력, 공격력, 마나);
	}
	
	@Override
	void 공격(Monster 적) {
		super.공격(적);
		마나 += 10;
		System.out.printf("마나가 %2d 되었습니다 \n", 마나);
	}
	
	void 명상() {
		System.out.printf("명상🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 \n");
		마나 += 20;
		System.out.printf("마나가 %2d 획복 되었습니다. \n", 마나);
	}

	void 라이트닝(Monster 적) {
		if(마나 >= 100) {
			자기소개();
			적.자기소개();
			System.out.println("⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ⚡");
			System.err.println("　⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ⚡");
			System.out.printf("%s -> %s 라이트닝 일격!! ", 이름, 적.get이름());
			int 데미지 = 적.get체력()-(공격력*2);
			적.set체력(데미지);	
			System.out.printf("%s의 체력: %2d\n", 적.get이름(), 적.get체력());
			System.out.println("⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ⚡");
			System.err.println("　⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ⚡");
			마나 -= 60;
		} else {
			System.out.println("마나가 부족하여 실패했습니다..");
		}
	}
}
