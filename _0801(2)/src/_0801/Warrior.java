package _0801;

public class Warrior extends Hero {
	
	int �г�;
	
	public Warrior(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		���ݷ� = ���ݷ°��();
		�г� = 30;
		�Ӽ� = "��";
	}
	
	int ���ݷ°��(){
		return ���ݷ� + 10;
	}
	
	@Override
	public void �ڱ�Ұ�(){
		super.�ڱ�Ұ�();
		System.out.printf("�г�:%s | �Ӽ�:%s\n", �г�,�Ӽ�);
	}

	@Override
	void ����(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
		��.ü�� -= ���ݷ�;
		�г� += 10;
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
	}

	@Override
	void Ư������(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		int Ư�����ݷ�;
		
		if(�г� >= 100) {
			Ư�����ݷ� = ���ݷ�*2; 
			�г� = 0;
		}else {
			Ư�����ݷ� = ���ݷ�;
		}
		
		if(��.�Ӽ�.equals("Ǯ")) {
			System.out.printf("Ǯ�� ���� �Ҿ� ȿ���� �����ߴ�\n");
			System.out.printf("�ҺҺҺҺҺҺҺҺҺҺҺҺҺҺҺҺ�\n");
			System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
			��.ü�� -= Ư�����ݷ�*3;
		}else {
			System.out.printf("%s �� %s ����!\n", �̸�,��.�̸�);
			��.ü�� -= Ư�����ݷ�*2;
			
		}
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
	}

}