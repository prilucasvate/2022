import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class d566 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		HashMap<String,String>  hm=new HashMap<>();
		int a=sc.nextInt();
		int z=0,x=0;
		String aa[]=new String[a*2];
		for(int i=0;i<a*2;i++) {
			aa[i]=sc.next();
		}
		for(int i=a*2-1;i>=0;i-=2) {
		
			if(aa[i].equals("AC")) {
				if(hm.containsKey(aa[i-1])) {
					if(hm.get(aa[i-1]).equals("AC")) {
						//continue;
					}else {
						x++;
					}
				}else {
					x++;
					z++;
				}
			}
			hm.put(aa[i-1], aa[i]);
			
		}
//		System.out.println(z);
//		System.out.println(x);
		System.out.println(z*100/(x)+"%");
		//-----------------------

		}
	}

}
