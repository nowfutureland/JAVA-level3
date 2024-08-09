package _0809;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Hero 영웅 = new Mage("물법사",80,7);
		
		Monster[] 몬스터들 = new Monster[2];
		몬스터들[0] = new Ork("풀오크",80,12);
		몬스터들[1] = new Golem("땅골렘",100,10);
		
		Random rd = new Random();
		
		Monster 나타난몬스터 = 몬스터들[rd.nextInt(2)];
		
		나타난몬스터.공격(영웅);
		
		Scanner sc = new Scanner(System.in);
		int 영웅행동;
		
		
		boolean 진행 = true;
		
		while(진행){	
			
			System.out.println("영웅 행동 선택 (1) 공격 | (2) 특수공격 | (3) 도망가기 >");
			영웅행동 = sc.nextInt();
			switch (영웅행동) {
			case 1:
				영웅.공격(나타난몬스터);
				System.out.printf("%s 공격함\n",영웅.이름);
				break;
				
			case 2:
				영웅.특수공격(나타난몬스터);
				System.out.printf("%s 특수공격함\n",영웅.이름);
				break;

			default:
				System.out.printf("%s 도망침\n",영웅.이름);
				진행 = false;
				break;
			}
			if(나타난몬스터.체력 <= 0) {
				나타난몬스터.죽기();
				System.out.printf("%s의 승리\n",영웅.이름);
				진행 = false;
			}
			
			if(영웅.체력 <=0 ) {
				영웅.죽기();
				System.out.printf("%s 승이",나타난몬스터.이름);
				진행 = false;
			}
			
			
		}
		
		
	}

}
