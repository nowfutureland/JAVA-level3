package Main;

public class Main {

	public static void main(String[] args) {
		Warrior h1 = new Warrior("피카츄", 100, 20);
		Monster m1 = new Monster("몬스터",100,15);
		
		h1.공격(m1);
		m1.공격(h1);
		h1.분노의일격(m1);
	}

}
