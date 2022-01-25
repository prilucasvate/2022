package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
public class engfin {

	public static void main(String[] args) {
		
		int n=1,w=0;;
		Scanner sc =new Scanner(System.in);
		ArrayList<String> al =new ArrayList<String>();
		//String[] v=new String[n];
		
		ok: for(int i=0;i<999;i++) {
		//	v[i]=sc.next();
			al.add(sc.next());
		//	n++;
			
			if(al.get(i).equals("0")||al.get(i).equals("0--1")) {
				System.out.println("finish");
				break ok;
			}
			if("9".compareTo(al.get(i))>=0) {
				int b="9".compareTo(al.get(i));
			//	System.out.println(b);
				switch(b) {
				case 8:
					w=1;
					break;
				case 7:
					w=2;
					break;
				case 6:
					w=3;
					break;
				case 5:
					w=4;
					break;
				case 4:
					w=5;
					break;
				case 3:
					w=6;
					break;
				case 2:
					w=7;
					break;
				case 1:
					w=9;
					break;
				case 24:
					al.set(i-1,"zzz...");
					break;
				}
			}
			
			al.set(i,al.get(i)+"->L"+w);
		}
	//	List<String> n = Arrays.asList(v);
	//	Arrays.sort(v);
	//	for(String q:v)
		Collections.sort(al);
		for(int r=0;r<al.size();r++) {
			if(al.get(r)!="zzz...")
			System.out.println(al.get(r));
		}
			
	}



}
