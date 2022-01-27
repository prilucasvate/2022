import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e700 {
	/*
	¤ô²~®y	1/21 ~ 2/19
	Âù³½®y	2/20 ~ 3/20
	¨d¦Ï®y	3/21 ~ 4/20
	ª÷¤û®y	4/21 ~ 5/21
	Âù¤l®y	5/22 ~ 6/21
	¥¨ÃÉ®y	6/22 ~ 7/22
	·à¤l®y	7/23 ~ 8/21
	³B¤k®y	8/22 ~ 9/23
	¤Ñ¯¯®y	9/24 ~ 10/23
	¤ÑÃÈ®y	10/24 ~ 11/22
	®g¤â®y	11/23 ~ 12/22
	¼¯½~®y	12/23 ~ 1/20
	*/
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		String a=sc.next();
		String []aa=a.split("/");
		String s=aa[0].concat(aa[1]);
		int c=Integer.parseInt(s);
		System.out.println(c);
		if(c>=121&&c<=219) {
			System.out.println("¤ô²~®y");
		}else if(c>=220&&c<=320) {
			System.out.println("Âù³½®y");
		}else if(c>=321&&c<=420) {
			System.out.println("¨d¦Ï®y");
		}else if(c>=421&&c<=521) {
			System.out.println("ª÷¤û®y");
		}else if(c>=522&&c<=621) {
			System.out.println("Âù¤l®y");
		}else if(c>=622&&c<=722) {
			System.out.println("¥¨ÃÉ®y");
		}else if(c>=723&&c<=821) {
			System.out.println("·à¤l®y");
		}else if(c>=822&&c<=923) {
			System.out.println("³B¤k®y");
		}else if(c>=924&&c<=1023) {
			System.out.println("¤Ñ¯¯®y");
		}else if(c>=1024&&c<=1122) {
			System.out.println("¤ÑÃÈ®y");
		}else if(c>=1123&&c<=1222) {
			System.out.println("®g¤â®y");
		}else {
			System.out.println("¼¯½~®y");
		}
		}
	}

}
