package tttt;

import java.math.BigInteger;

public class t {

	public static void main(String[] args) {
		BigInteger down=new BigInteger("1");
		for(double d=1;d<10000;d++) {
			Integer a1=new Integer((int) d);
			BigInteger tdown=new BigInteger(a1.toString());
			down=down.multiply(tdown);
		}
		System.out.println(down);

	}

}




