package listt;

import java.util.LinkedList;

public class ll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>  data=new LinkedList<>();
        data.add(8);
        data.add(5);
        data.add(16);
        data.add(2);
        data.add(20);
        System.out.println("data="+data);
       // data.remove(2);
        data.remove(new Integer(2));
        System.out.println("data="+data);


	}

}
