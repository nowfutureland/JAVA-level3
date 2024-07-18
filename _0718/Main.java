package _0718;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Poketmon [] 포켓 = {
			new Fire("파이리", 100, 10),
			new Water("꼬부기", 100, 10)
		};
		
		Poketmon 나 = 포켓[0];
		Poketmon 적 = 포켓[1];

		boolean 진행 = true;
		
		while(진행 == true) {
			행동(나, 적, 진행, scan);
			진행 = 행동(나, 적, 진행, scan);
		}
	}

	static Boolean 행동(Poketmon 나, Poketmon 적, boolean 진행, Scanner scan) {
		boolean 진행2 = true;
		while(진행) {
			if(적.getHp() <= 0) {
				System.out.printf("%s의 승리\n", 나.getName());
				진행 = false;
			} else if(나.getHp() <= 0){
				System.out.printf("%s의 승리\n", 적.getName());
				진행 = false;
			}
			System.out.printf("어떤 행동 할래 ? (1)자기소개 | (2)공격 | (3)특수공격 | (4)도망가기 > ");
			int num = scan.nextInt();
			
			if(진행2 == true) {
				System.out.println("파이리가 공격을 합니다");
				switch (num) {
				case 1:
					나.자기소개();
					진행2 = !진행2;
					break;
				case 2:
					나.공격(적);
					진행2 = !진행2;
					break;
				case 3:
					나.특수공격(적);
					진행2 = !진행2;
					break;
				default:
					System.out.println("도망가기~");
					break;
				}
			} else {
				System.out.println("꼬부기가 공격을 합니다");
				switch (num) {
				case 1:
					적.자기소개();
					진행2 = !진행2;
					break;
				case 2:
					적.공격(나);
					진행2 = !진행2;
					break;
				case 3:
					적.특수공격(나);
					진행2 = !진행2;
					break;
				default:
					System.out.println("도망가기~");
					break;
				}
			}
			if(num == 4) {
				break;
			}
		}
		System.out.println(진행);
		return 진행;
	}

}
