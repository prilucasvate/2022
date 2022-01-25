package tttt;

import java.util.Scanner;

public class compareTo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
			
		String Str2 =sc.next(); ;//null cannot compareTo...
		String Str1 = "9";
		if(Str1.compareTo(Str2)==0) {
			System.out.println(Str1.compareTo(Str2));
		}else {
			System.out.println(Str1.compareTo(Str2));
		}
		}	//same=0 dif==str1-str2
	}

}
