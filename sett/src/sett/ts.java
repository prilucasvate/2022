package sett;

import java.util.SortedSet;
import java.util.TreeSet;

public class ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet sTs = new TreeSet();		
		
		sTs.add("1");	
		sTs.add("Vincent Tuan");
		sTs.add("Anita Wu");
		sTs.add("Howard Tuan");	
		sTs.add("Z");
		sTs.add("Z");
		System.out.println("��l��SortedSet�������");
		System.out.println(sTs);
		System.out.println();
		SortedSet sub_sTs = sTs.subSet("Anita Wu", "Z");//		
		System.out.println("�qSortedSet���Q��subSet()��k���X�������X����");//(random?)
		System.out.println(sub_sTs);

	}

}
