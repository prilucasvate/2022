package sett;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class set_lottery {

	public static void main(String[] args) {
		TreeSet<Integer>  user=new TreeSet<Integer>();
        TreeSet<Integer>  pc=new TreeSet<Integer>();
        Scanner  sc=new Scanner(System.in);
        int i=1,n;
        do{
            System.out.print("第"+i+"個數字:");
            n=sc.nextInt();
            if(n<1 || n>49)
            {
                System.out.println("輸入錯誤,必須1~49");
                continue;
            }
            if(user.contains(n))
            {
                System.out.println("號碼重覆...");
                continue;
            }
            user.add(n);
            i++;            
        }while(i<=6);
        System.out.println("user:"+user);
      //開獎
        i=1;
        do{
            n=(int)(Math.random()*49+1);
            if(pc.contains(n))
                continue;
            pc.add(n);
            i++;
        }while(i<=6);
        System.out.println("pc:"+pc);
      //讀user集合
        Iterator  x=user.iterator();
        int count=0;
        
        while(x.hasNext())
        {
            n=(int) x.next();
            if(pc.contains( n ))
                count++;
        }
        System.out.println("你中"+count+"個");
        switch(count){
        case 0:
        	System.out.print("得"+0+"元");
        	break;
        case 1:
        	System.out.print("得"+10+"元");
        	break;
        case 2:
            System.out.print("得"+100+"元");
            break;
        case 3:
            System.out.print("得"+1000+"元");
            break;
        case 4:
            System.out.print("得"+10000+"元");
            break;
        case 5:
            System.out.print("得"+100000+"元");
            break;
            default:
            System.out.print("得"+1000000+"元");
            break;
        }



	}

}
