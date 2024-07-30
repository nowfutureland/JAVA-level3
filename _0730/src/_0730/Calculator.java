package _0730;

public class Calculator {

	private int 결과;
	
	int get결과() {
		return 결과;
	}
	
	void set결과(int 결과) {
		this.결과 = 결과;
	}
	
	int 더하기(int 숫자1, int 숫자2, int 숫자3) {
		결과 = 숫자1+숫자2+숫자3;
		return 결과;
	}
	
	int 빼기(int 숫자1, int 숫자2, int 숫자3) {
		결과 = 숫자1-숫자2-숫자3;
		return 결과;
	}

}
