import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e700 {
	/*
	���~�y	1/21 ~ 2/19
	�����y	2/20 ~ 3/20
	�d�Ϯy	3/21 ~ 4/20
	�����y	4/21 ~ 5/21
	���l�y	5/22 ~ 6/21
	���ɮy	6/22 ~ 7/22
	��l�y	7/23 ~ 8/21
	�B�k�y	8/22 ~ 9/23
	�ѯ��y	9/24 ~ 10/23
	���Ȯy	10/24 ~ 11/22
	�g��y	11/23 ~ 12/22
	���~�y	12/23 ~ 1/20
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
			System.out.println("���~�y");
		}else if(c>=220&&c<=320) {
			System.out.println("�����y");
		}else if(c>=321&&c<=420) {
			System.out.println("�d�Ϯy");
		}else if(c>=421&&c<=521) {
			System.out.println("�����y");
		}else if(c>=522&&c<=621) {
			System.out.println("���l�y");
		}else if(c>=622&&c<=722) {
			System.out.println("���ɮy");
		}else if(c>=723&&c<=821) {
			System.out.println("��l�y");
		}else if(c>=822&&c<=923) {
			System.out.println("�B�k�y");
		}else if(c>=924&&c<=1023) {
			System.out.println("�ѯ��y");
		}else if(c>=1024&&c<=1122) {
			System.out.println("���Ȯy");
		}else if(c>=1123&&c<=1222) {
			System.out.println("�g��y");
		}else {
			System.out.println("���~�y");
		}
		}
	}

}
