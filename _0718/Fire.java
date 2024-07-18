package _0718;

public class Fire extends Poketmon{
	int 불공격력;
	public Fire(String name, int hp, int atk) {
		super(name, hp, atk);
		this.속성 = "불";
		불공격력 = atk;
	}

	@Override
	public int 공격력계산(int 특수공격력) {
		특수공격력 = 불공격력 + 5;
		return 특수공격력;
	}
	
	@Override
	public void 공격(Poketmon 적) {
		자기소개();
		적.자기소개();
		적.setHp(적.getHp() - 공격력계산(불공격력));
		System.out.println("-------------------------------");
		System.out.printf("%s의 체력을 %d만큼 감소\n", 적.getName(), 공격력계산(불공격력));
		System.out.printf("현재 %s의 체력 : %d\n", 적.getName(), 적.getHp());
		System.out.println("-------------------------------");
	}

	@Override
	public void 특수공격(Poketmon 적) {
		자기소개();
		적.자기소개();
		if(적.get속성().equals("물")) {
			System.out.println("-------------------------------");
			System.out.println("공격이 먹히지 않음");
			System.out.println("-------------------------------");
		} else {
			적.setHp(getHp() - (공격력계산(불공격력) * 2));
			System.out.println("-------------------------------");
			System.out.println("火火火火火火火火火火火火火火火火火火火火火火火火");
			System.out.printf("火특수 공격 성공!\n %s의 체력을 %d 만큼 감소!火\n", 적.getName(), 공격력계산(불공격력) * 2);
			System.out.println("火火火火火火火火火火火火火火火火火火火火火火火火");
			System.out.printf("현재 %s의 체력 : %d", 적.getName(), 적.getHp());
			System.out.println("-------------------------------");
		}
	}

	
	
}
