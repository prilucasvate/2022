package tt;



public class tt {

	
	public static void main(String[] args)  {
		for (int i = 2;i<= 100;i++){//1�J���O��Ƥ]���O�M�ơA�ҥH�q2�}�l
			boolean k = true; //�P�_����
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					k = false;  //�D��ƶ�false
					break;
				}
			}
				if(k){
					System.out.print(i + " ");
				}
		}
	}
}