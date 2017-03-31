package purna.math;

import java.math.BigInteger;

public class BigDecimalExample {

	public static void main(String[] args) {

		BigInteger bi1 = new BigInteger("100000000000");
		BigInteger bi2 = new BigInteger("11111");
		BigInteger bi3 = bi1.add(bi2);
		System.out.println(bi3);
		
		int i = bi3.intValue();
		System.out.println(i);
	}

}
