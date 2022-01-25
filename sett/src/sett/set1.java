package sett;

import java.util.HashSet;
import java.util.Iterator;

public class set1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//依序加入元素Vincent, Anita, Howard
		hs.add("Vincent Tuan");
		hs.add("Anita Wu");
		hs.add("Howard Tuan");
		//再將null加入至元素中
		hs.add(null);
		//直接列印HashSet,預設是利用toString()方法
		System.out.println("直接列印HashSet,預設是利用toString()方法");
		System.out.println(hs);
		System.out.println();
		//利用Iterator將HashSet集合中的所有元素依序取出
		System.out.println("利用Iterator將HashSet集合中的所有元素依序取出");
		Iterator I = hs.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}

	}

}
