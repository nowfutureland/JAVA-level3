
package _0801;

public abstract class Monster {
	
	String 이름;
	int 체력;
	int 공격력;
	String 속성;
	boolean 생사여부;
	
	public Monster(String 이름, int 체력, int 공격력) {
		this.이름 = 이름;
		this.체력 = 체력;
		this.공격력 = 공격력;
		생사여부 = true;
	}
	
	//구상 메소드
	void 자기소개() {
		System.out.printf("%s의 체력:%d 공격력:%d \n" ,이름,체력,공격력);
	}
	
	void 죽기() {
		생사여부 = false;
		System.out.printf("%s가 죽었다\n" ,이름);
	}
	
	abstract void 공격(Hero 적);

}
