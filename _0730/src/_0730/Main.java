package _0730;

public class Main {

	public static void main(String[] args) {
		
		Calculator 계산기1 = new Calculator();
		
		int 수1 = 18;
		int 수2 = 28;
		int 수3 = 38;
		
		System.out.println(계산기1.더하기(수1, 수2, 수3));
		
		System.out.println(계산기1.get결과());
		
		계산기1.set결과(121212);

	}

}
