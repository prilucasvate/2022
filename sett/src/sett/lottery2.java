package sett;

import java.util.Scanner;
import java.util.TreeSet;

public class lottery2 {

	public static void main(String[] args) {
		System.out.println("money?");
		Scanner sc=new Scanner(System.in);
		int ts=sc.nextInt()/50;
		TreeSet<Integer>  temp=new TreeSet<Integer>();
		TreeSet<Integer>  all=new TreeSet<Integer>();
		System.out.println("三組必含的");
		temp.add(sc.nextInt());
		temp.add(sc.nextInt());
		temp.add(sc.nextInt());
		for(int v=0;v<ts;v++) {
		
		
		int c=0;
		do {
		c=(int) (Math.random()*49+1);
	//	System.out.println(c);
		if(temp.contains(c)) {
			continue;
		}else {
			all.add(c);
		}
		}while(all.size()<=3);
		all.addAll(temp);
		System.out.println(all+" ");
		all.clear();
		}

	}

}
