package _0731;

public abstract class Hero {

	String �̸�;
	int ü��;
	int ���ݷ�;
	String �Ӽ�;
	boolean ���翩��;
	
	public Hero(String �̸�, int ü��, int ���ݷ�) {
		this.�̸� = �̸�;
		this.ü�� = ü��;
		this.���ݷ� = ���ݷ�;
		���翩�� = true;
	}
	
	//���� �޼ҵ�
	void �ڱ�Ұ�() {
		System.out.printf("%s�� ü��:%d ���ݷ�:%d \n" ,�̸�,ü��,���ݷ�);
	}
	
	void �ױ�() {
		���翩�� = false;
		System.out.printf("%s�� �����ߴ�\n" ,�̸�);
	}
	
	//�߻� �޼ҵ�
	abstract void ����(Monster ��);
	abstract void Ư������(Monster ��);

}
