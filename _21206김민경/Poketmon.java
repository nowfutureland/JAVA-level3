package _21206김민경;

public abstract class Poketmon {
	
	String 이름;
	int 체력;
	int 공격력;
	String 속성;
	
	public Poketmon(String 이름, int 체력, int 공격력, String 속성) {
		super();
		this.이름 = 이름;
		this.체력 = 체력;
		this.공격력 = 공격력;
		this.속성 = 속성;
	}

	public Poketmon(String 이름2, int 체력2, int 불공격력) {
		// TODO Auto-generated constructor stub
	}

	void 자기소개() {
		System.out.printf("이름: %s | 체력:%d | 속성: %s", 이름, 체력, 속성);
	}
	
	abstract void 공격(Poketmon 적);
	
	abstract void 특수공격(Poketmon 적);

	
	abstract int 공격력계산(int 특수공격력);

	
}
