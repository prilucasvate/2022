package tttt;

public class pi {

	public static void main(String[] args) throws InterruptedException {
		int hit=0,ttl=0;
		while(true){
			float x= (float) (Math.random()*2-1);
			float y=(float) (Math.random()*2-1);
			if(x*x + y*y <1) {
				hit++;
				
			}
			System.out.println((float)hit /(float) ttl * 4 + "  ["+ttl+"]");
			ttl++;
			Thread.sleep(100);
		}

	}

}
