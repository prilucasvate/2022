package listt;

import java.util.LinkedList;
import java.util.Scanner;

public class linklistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name=new LinkedList<>();
        LinkedList<Integer> score=new LinkedList<>();
        Scanner  sc=new Scanner(System.in);
        String user;
        int s;
        do{
            System.out.print("input name(end����):");
            user=sc.next();
            if(user.equalsIgnoreCase("end"))
                break;
            System.out.print("input score:");
            s=sc.nextInt();
            if(s<0 || s>100)
            {
                System.out.println("��J���~,����0~100");
                continue;
            }
            name.add(user);
            score.add(s);            
        }while(true);
        System.out.println("name="+name);
        System.out.println("score="+score);
        int count=0;
        System.out.println("���ή�ǥ�-------------");
        for(int i=0;i<name.size();i++)
        {
            if(score.get(i)<60)
            {
                System.out.println(name.get(i)+"  "+score.get(i));
                count++;
            }
        }


	}

}
