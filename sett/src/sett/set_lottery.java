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
            System.out.print("��"+i+"�ӼƦr:");
            n=sc.nextInt();
            if(n<1 || n>49)
            {
                System.out.println("��J���~,����1~49");
                continue;
            }
            if(user.contains(n))
            {
                System.out.println("���X����...");
                continue;
            }
            user.add(n);
            i++;            
        }while(i<=6);
        System.out.println("user:"+user);
      //�}��
        i=1;
        do{
            n=(int)(Math.random()*49+1);
            if(pc.contains(n))
                continue;
            pc.add(n);
            i++;
        }while(i<=6);
        System.out.println("pc:"+pc);
      //Ūuser���X
        Iterator  x=user.iterator();
        int count=0;
        
        while(x.hasNext())
        {
            n=(int) x.next();
            if(pc.contains( n ))
                count++;
        }
        System.out.println("�A��"+count+"��");
        switch(count){
        case 0:
        	System.out.print("�o"+0+"��");
        	break;
        case 1:
        	System.out.print("�o"+10+"��");
        	break;
        case 2:
            System.out.print("�o"+100+"��");
            break;
        case 3:
            System.out.print("�o"+1000+"��");
            break;
        case 4:
            System.out.print("�o"+10000+"��");
            break;
        case 5:
            System.out.print("�o"+100000+"��");
            break;
            default:
            System.out.print("�o"+1000000+"��");
            break;
        }



	}

}
