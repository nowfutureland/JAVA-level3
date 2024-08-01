package _0801_ArrayList;

import java.util.ArrayList;

public class ArryListTest {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println(al.size());
		al.add(18);
		al.add(28);
		al.add(38);
		System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(1);
		System.out.println();
		
		for(Integer i : al) {
			System.out.println(i);
		}
		
		
	}
}
