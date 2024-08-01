package _0801_ArrayList;

import java.util.ArrayList;

import _0801.Golem;
import _0801.Monster;
import _0801.Ork;

public class 몬스터_ArryListTest {
	
	public static void main(String[] args) {
	
		ArrayList<Monster> 몬스터들 = new ArrayList<Monster>();
		
		몬스터들.add(new Ork("풀오크",80,12));
		몬스터들.add(new Golem("땅골렘",100,10));	
		
		for(Monster m : 몬스터들) {
			m.자기소개();
		}
		
		
		
	}
}
