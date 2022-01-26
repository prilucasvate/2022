import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class c657 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		HashMap<Integer,String>  mr=new HashMap<>();
		String a=sc.next();
		StringBuilder strb = new StringBuilder(a);
		a = strb.reverse().toString();
		String[] aa=a.split("");
		int s[]=new int [122];
		int m=0;
		for(int i=0;i<aa.length-1;i++) {
			if(aa[i].equals(aa[i+1])) {
				s[m]++;
				mr.put(s[m],aa[i]);
			}else {
				m++;
			}
		}
		Arrays.sort(s);
		System.out.println(mr.get(s[s.length-1])+" "+(s[s.length-1]+1));
		
		}
	}
}
