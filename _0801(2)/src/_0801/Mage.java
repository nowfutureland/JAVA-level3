
package _0801;

public class Mage extends Hero implements Fire, Wind {
	
	int ����;
	
	public Mage(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		���ݷ� = ���ݷ°��()+�Ұ��ݷ�+�ٶ����ݷ�;
		���� = 30;
		�Ӽ� = "��";
	}
	
	int ���ݷ°��(){
		return ���ݷ� + 5;
	}
	
	@Override
	void �ڱ�Ұ�(){
		super.�ڱ�Ұ�();
		System.out.printf("����:%s | �Ӽ�:%s\n", ����,�Ӽ�);
	}

	@Override
	void ����(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
		��.ü�� -= ���ݷ�;
		���� += 15;
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
	}

	@Override
	void Ư������(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		int Ư�����ݷ�;
		
		if(���� >= 100) {
			Ư�����ݷ� = ���ݷ�*3; 
			���� = 0;
		}else {
			Ư�����ݷ� = ���ݷ�;
		}
		
		if(��.�Ӽ�.equals("��")) {
			System.out.printf("���� ��Ʈ�� ȿ���� �����ߴ�\n");
			System.out.printf("����������������������������������\n");
			System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
			��.ü�� -= Ư�����ݷ�*3;
			
		}else {
			System.out.printf("Ư������ ����\n", �̸�,��.�̸�);	
		}
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
	}

	@Override
	public void �Ҽ�() {
		System.out.println("�Ҽ�");
		
	}

}
