package _0801_ArrayList;

import java.util.ArrayList;

import _0801.Golem;
import _0801.Monster;
import _0801.Ork;

public class ����_ArryListTest {
	
	public static void main(String[] args) {
	
		ArrayList<Monster> ���͵� = new ArrayList<Monster>();
		
		���͵�.add(new Ork("Ǯ��ũ",80,12));
		���͵�.add(new Golem("����",100,10));	
		
		for(Monster m : ���͵�) {
			m.�ڱ�Ұ�();
		}
		
		
		
	}
}
