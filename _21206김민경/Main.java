package _21206김민경;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Fire Poketmon = new Fire("파이리",100, 10);
		water Poketmon1 = new water("꼬부기",100, 10);
		
		
		Poketmon 나 = null  ;
		water 적 = null   ;
		boolean 진행 = false;
		
		try (Scanner sc = new Scanner(System.in)) {
			while(진행) {
				System.out.println("(1) 자기소개 | (2) 공격 | (3) 특수공격 | (4) 도망가기");
				
				switch(sc.nextInt()) {
				case 1 :
					나.자기소개();
					break;
					
				case 2 :
					나.공격(적);
					break;
					
				case 3 :
					나.특수공격(적);
					break;
				case 4 :
					System.out.println("도망가기");
				}
			break;
			
			}
		}
		

	}

}
