import java.util.HashMap;
import java.util.Scanner;

public class d710 {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);

	      //  while( sc.hasNext() ) {
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	          String aa[]=new String[n];
	          String bb[]=new String[m*2];
	            for(int  i=0;i<n;i++) {
	            	String a=sc.next();
	            	String b=sc.next();
	            	String c=a+" "+b;
	            	aa[i]=c;
	            }
	            for(int  i=0;i<m*2;i++) {
	            	bb[i]=sc.next();
	            }
	            //---------------------
	            for(int  i=0;i<m*2;i+=2) {
	            	if(bb[i].equals("brand")) {
	            		 for(int  ii=0;ii<n;ii++) {
	            			 if(aa[ii].startsWith(bb[i+1])) {
	            				 System.out.println(aa[ii]);
	            			 }
	            		 }
	            	}else if(bb[i].equals("color")) {
	            		 for(int  ii=0;ii<n;ii++) {
	            			 if(aa[ii].endsWith(bb[i+1])) {
	            				 System.out.println(aa[ii]);
	            			 }
	            		 }
	            	}
	            }
	   //     }

	}

}
