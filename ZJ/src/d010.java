import java.util.Scanner;

public class d010 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		int ttl=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0){
				ttl=ttl+i;
				
		//		System.out.println(i);
				
			}
		}
		if(ttl-a==a) {
			System.out.println("������");
		}else if(ttl-a<a) {
			System.out.println("����");
		}else if(ttl-a>a) {
			System.out.println("�ռ�");
		}
	//	System.out.println(ttl-a);
		}
	}
	
}
