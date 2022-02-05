import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class d267 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		HashMap<Character,Integer>  mm=new HashMap<>();
		int a=Integer.parseInt(sc.nextLine());
		for(int hh=0;hh<a;hh++) {
		String aa=sc.nextLine();
		//String ss[]=aa.split("");
		char t[]=aa.toLowerCase().toCharArray();
		int tt[]=new int[123];
		int ttt[]=new int[123];
		int b=0;
		for(int i=0;i<123;i++) {
			ttt[i]=tt[i];
		}

		for(int i=0;i<t.length;i++) {
			if(t[i]!=' ') {
			 if(mm.containsKey(t[i])) {
				 tt[(int)t[i]]++;
				 mm.put(t[i],tt[(int)t[i]]);
				 
			 }else {
				 tt[(int)t[i]]++;
				 mm.put(t[i],tt[(int)t[i]]);
				 
			 }
			}
		}
		for(int i=0;i<123;i++) {
			ttt[i]=tt[i];
		}
		Arrays.sort(ttt);
		if(ttt[122]==0) {
			System.out.print("abcdefghijklmnopqrstuvwxyz");
			System.out.println();
		}else {
		for(int i=0;i<123;i++) {
			if(ttt[122]==tt[i]) {
				 if(i>96)
				System.out.print((char)i);
				
			}
		}
		System.out.println();
//		for(int i=0;i<tt.length;i++) {
//			System.out.print(t[i]+" ");
//		}
		}
		}
		}
	}

}
