package tt;



public class tt {

	
	public static void main(String[] args)  {
		for (int i = 2;i<= 100;i++){//1既不是質數也不是和數，所以從2開始
			boolean k = true; //判斷條件
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					k = false;  //非質數傳false
					break;
				}
			}
				if(k){
					System.out.print(i + " ");
				}
		}
	}
}