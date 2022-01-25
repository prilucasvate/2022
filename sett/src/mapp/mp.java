package mapp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class mp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
        HashMap<Integer, Integer> Sites = new HashMap<>();
        int[] s=new int[30001];
        for(int ss:s)
        	s[ss]=0;
        for(int n=0;n<a;n++) {
        	int i=Integer.parseInt(sc.next());
        	if(!Sites.containsKey(i)) {
        	Sites.put(i,s[i]);
        	}else {
        		s[i]++;
        	}
        }
        Arrays.sort(s);
        for(int n=0;n<s.length;n++) 
        System.out.print(s[n]);

	}

}
//12
//2  4  2  3  2  5  3  7  2  3  4  3