import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e700 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		String a=sc.next();
		String []aa=a.split("/");
		String s=aa[0].concat(aa[1]);
		int c=Integer.parseInt(s);
		String ans="";
		//System.out.println(c);
		if(c>=121&&c<=219) {
			ans="���~�y";
		}else if(c>=220&&c<=320) {
			ans="�����y";
		}else if(c>=321&&c<=420) {
			ans="�d�Ϯy";
		}else if(c>=421&&c<=521) {
			ans="�����y";
		}else if(c>=522&&c<=621) {
			ans="���l�y";
		}else if(c>=622&&c<=722) {
			ans="���ɮy";
		}else if(c>=723&&c<=821) {
			ans="��l�y";
		}else if(c>=822&&c<=923) {
			ans="�B�k�y";
		}else if(c>=924&&c<=1023) {
			ans="�ѯ��y";
		}else if(c>=1024&&c<=1122) {
			ans="���Ȯy";
		}else if(c>=1123&&c<=1222) {
			ans="�g��y";
		}else {
			ans="���~�y";
		}
		System.out.println(ans);
		}
	}

}
