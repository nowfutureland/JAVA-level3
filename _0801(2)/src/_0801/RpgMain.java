package _0801;

import java.util.Random;
import java.util.Scanner;

public class RpgMain {

	public static void main(String[] args) {
		
		Hero[] ����ε� = new Hero[2];
		//�������� Ư¡
		����ε�[0] = new Warrior("����",100,10);
		����ε�[1] = new Mage("����",80,7);
//		for(int i=0; i<����ε�.length; i++)
		for(Hero h : ����ε�) {
			h.�ڱ�Ұ�();
		}
		
//	���� ��ü�迭 �����
		Monster[] ���͵� = new Monster[2];
//	���� �ʱ�ȭ �۾� �ϱ�
		���͵�[0] = new Ork("Ǯ��ũ",80,12);
		���͵�[1] = new Golem("����",100,10);		
//	�������� ���� �� ���� �̱�
		Random rd = new Random();
		Monster ��Ÿ������ = ���͵�[rd.nextInt(2)];
		
		System.out.printf("���� %s��(��) ��Ÿ����!\n",��Ÿ������.�̸�);
		��Ÿ������.�ڱ�Ұ�();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���. (1)������ (2)������ > ");
		int �������� = sc.nextInt()-1;
		Hero ���� = ����ε�[��������];
		
		System.err.printf("%s ���� ����!\n", ����.�̸�);
		����.�ڱ�Ұ�();
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("%s, %s ���� ����!\n",����.�̸�,��Ÿ������.�̸�);
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		boolean ���� = true;
		
		while(����) {
			// ���� �ൿ
			System.out.printf("%s ��, (1)���� | (2)Ư������ (3)����ġ�� > ",����.�̸�);
			int �ൿ���� = sc.nextInt();
			
			switch (�ൿ����) {
			case 1:
				System.out.printf("%s�� %s�� ����! \n", ����.�̸�,��Ÿ������.�̸�);
				����.����(��Ÿ������);
				break;
				
			case 2:
				System.out.printf("%s�� %s�� ����!! \n", ����.�̸�,��Ÿ������.�̸�);
				����.Ư������(��Ÿ������);
				break;
				
			default:
				System.out.printf("%s�� ����ħ������\n", ����.�̸�);
				���� = false;
			}
			
			// ���Ͱ� �׾���?
			if(��Ÿ������.ü�� <= 0 ) {
//				��Ÿ������.���翩�� = false;
				��Ÿ������.�ױ�();
				System.out.printf("%s �¸�^^", ����.�̸�);
				���� = false;
			}
			
			// ���� �װų� ����ġ�� ����
			if(����==false) break;
			
			//���� �ൿ
			��Ÿ������.����(����);
			if(����.ü�� <= 0) {
				����.�ױ�();
				System.out.printf("%s �¸� \n",��Ÿ������.�̸�);
				���� = false;
			}
		}
	}

}
