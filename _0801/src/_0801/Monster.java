
package _0801;

public abstract class Monster {
	
	String �̸�;
	int ü��;
	int ���ݷ�;
	String �Ӽ�;
	boolean ���翩��;
	
	public Monster(String �̸�, int ü��, int ���ݷ�) {
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
		System.out.printf("%s�� �׾���\n" ,�̸�);
	}
	
	abstract void ����(Hero ��);

}
