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
			ans="¤ô²~®y";
		}else if(c>=220&&c<=320) {
			ans="Âù³½®y";
		}else if(c>=321&&c<=420) {
			ans="¨d¦Ï®y";
		}else if(c>=421&&c<=521) {
			ans="ª÷¤û®y";
		}else if(c>=522&&c<=621) {
			ans="Âù¤l®y";
		}else if(c>=622&&c<=722) {
			ans="¥¨ÃÉ®y";
		}else if(c>=723&&c<=821) {
			ans="·à¤l®y";
		}else if(c>=822&&c<=923) {
			ans="³B¤k®y";
		}else if(c>=924&&c<=1023) {
			ans="¤Ñ¯¯®y";
		}else if(c>=1024&&c<=1122) {
			ans="¤ÑÃÈ®y";
		}else if(c>=1123&&c<=1222) {
			ans="®g¤â®y";
		}else {
			ans="¼¯½~®y";
		}
		System.out.println(ans);
		}
	}

}
