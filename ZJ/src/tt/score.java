package tt;

import java.util.Arrays;
import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		String ttl[]=new String[v+1]; 
		int ttl2[]=new int[v+1];
		for(int i=0;i<v+1;i++) {
			ttl[i]=sc.nextLine();
		}
		Arrays.sort(ttl);
	//	System.out.println(ttl);
//		for(int i=0;i<v+1;i++) {
//	ttl2[i]=Integer.parseInt(ttl[i]);
//		}
		for(int i=v;i > -1;i--) {
			System.out.println(ttl[i]);
		}
	}
}
