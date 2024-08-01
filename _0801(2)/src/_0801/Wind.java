package _0801;

public interface Wind {
	
	// static final 생략
	static int 바람공격력 = 40;
	
	// abstract
	static void 불공격(Monster 적){
		적.체력 -= 바람공격력;
	}
	
	void 불쇼();
}
