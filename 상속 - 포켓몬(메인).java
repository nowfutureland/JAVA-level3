package sw212;

public class PmonMain {

	public static void main(String[] args) {
		Qmon 나 = new Qmon();
		Pmon 몬스터 = new Pmon();
		
		나.상태창();
		몬스터.상태창();
		
		몬스터.몸통박치기(나);
		
		나.상태창();
		몬스터.상태창();
		
		나.몸통박치기(몬스터);

		나.상태창();
		몬스터.상태창();
	}
}
