package _0801;

public class Golem extends Monster {
	
	int ���;
	
	public Golem(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		��� = 20;
		�Ӽ� = "��";
	}
	
	@Override
	void �ڱ�Ұ�() {
		super.�ڱ�Ұ�();
		System.out.printf("���:%d | �Ӽ�:%s\n",���,�Ӽ�);
	}
	
	void ����(Hero ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		��� += 15;
		
		if(��� >= 100) {
			System.err.printf("%s�� ü�� ȸ��!\n",�̸�);
			ü�� = 100;
			��� = 0;
		}
		
		if(��.�Ӽ�.equals("��")) {
			System.err.printf("�ҼӼ����� ȿ���� �����ߴ�\n");
			System.out.printf("������������������������������\n");
			System.out.printf("%s �� %s ���Ѱ���!\n", �̸�,��.�̸�);
			��.ü�� -= ���ݷ�*2;
		}else {
			System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
			��.ü�� -= ���ݷ�;
		}
	}
}