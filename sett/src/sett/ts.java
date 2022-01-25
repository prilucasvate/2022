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
		System.out.println("原始的SortedSet元素資料");
		System.out.println(sTs);
		System.out.println();
		SortedSet sub_sTs = sTs.subSet("Anita Wu", "Z");//		
		System.out.println("從SortedSet中利用subSet()方法取出部分集合元素");//(random?)
		System.out.println(sub_sTs);

	}

}
