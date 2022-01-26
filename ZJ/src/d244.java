import java.util.Arrays;
import java.util.Scanner;

public class d244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] aa=(a.split(" "));
		int aaa[]=new int[aa.length];
		for(int i=0;i<aaa.length;i++) {
			aaa[i]=Integer.parseInt(aa[i]);
		}
		//-----------------------------
		Arrays.sort(aaa);
		for(int i=0;i<aaa.length-2;i+=3) {
			if(aaa[i]==aaa[i+1]&&aaa[i+1]==aaa[i+2]) {
			}
			else {
				System.out.println(aaa[i+1]);
			}
		}
//		for(int i=0;i<aaa.length;i++) {
//			System.out.println(aaa[i]);
//		}

	}

}
