package _0801;

public interface Fire {
	
	// static final 생략
	static int 불공격력 = 40;
	
	// abstract
	static void 불공격(Monster 적){
		적.체력 -= 불공격력;
	}
	
	void 불쇼();
}
