package mapp;

import java.util.HashMap;
import java.util.Scanner;

public class mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>  member=new HashMap<>();
        member.put("shit", "s123");
        member.put("fuck", "f123");
        member.put("dick", "d123");
        member.put("ass", "a123");
        Scanner  sc=new Scanner(System.in);
    //    while(sc.hasNext()) {
        System.out.print("±b¸¹:");
        String user=sc.next();
        System.out.print("±K½X:");
        String pwd=sc.next();
        System.out.println(member.get(user));
//        if(member.containsKey(user))
//        {
//            if(member.get(user).equals(pwd)) {
//                System.out.println("welcome");
//            System.out.print(member.get(user)+" "+pwd);
//            
//            } else
//                System.out.println("password error");
//                
//        }
//        else
//            System.out.println("account error");
//
//  //      }
	}

}
