package _0718;

public abstract class Poketmon {
	String name;
	int hp;
	int atk;
	String 속성;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String get속성() {
		return 속성;
	}
	public void set속성(String 속성) {
		this.속성 = 속성;
	}

	public Poketmon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = 5;
	}
	
	public void 자기소개() {
		System.out.printf("이름 : %s, 체력 : %d, 속성 : %s\n", getName(), getHp(), get속성());
	}
	
	public abstract void 공격(Poketmon 적);
	public abstract void 특수공격(Poketmon 적);
	public abstract int 공격력계산(int 특수공격력);
}
