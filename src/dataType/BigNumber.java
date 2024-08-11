package dataType;

import java.math.BigInteger;

public class BigNumber {
	
	/*
	 * ----------------- For Big Numbers -------------------
	 * 		# work when ever the memory is available
	 * 		# BigInteger
	 * 		# BigDecimal
	 * 
	 * 
	 */

	public static void main(String[] args) {
		long sum = Long.MAX_VALUE + Long.MAX_VALUE;
		System.out.println(sum);
		
		BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger addition = a.add(b);
		BigInteger multiply = a.multiply(b);
		
		System.out.println(addition);
		System.out.println(multiply);
		
		
	}
}
