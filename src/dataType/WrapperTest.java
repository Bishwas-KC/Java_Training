package dataType;

public class WrapperTest {
	
	/*
	 * --------- Wrapper Classes -----------
	 * # Every primitive data type have its own respective class is known as wrapper class
	 * # Wrapper class contains so many in-build method that are used to processing primitive values/data
	 * 
	 * 
	 * 		Primitive_Type				Wrapper_Type
	 * 		---------------			------------------
	 * 			byte					Byte
	 * 			short					Short
	 * 			long					Long
	 * 			double 					Double
	 * 			char 					Character
	 * 
	 *		  // 'a' is int variable only
	 *        int a = 900;     
	 *        
	 *        //'x' is reference variable or object
	 *        Integer x = 900; more space than int
	 *        
	 *        
	 *        
	 *        
	 *        ----------------- Auto Boxing -------------
	 *        # conversion of primitive type into wrapper type is known as auto-boxing
	 *        long m = 8765432;
	 *        //auto boxing
	 *        Long n = m  
	 *        
	 *        
	 *        ----------------- Auto Un-Boxing -------------
	 *        # conversion of wrapper type into primitive type
	 *        
	 *        for Example
	 *        Double t = 34567890.5678;
	 *        // auto un-boxing
	 *        double h = t;  
	 *        

	 *        
	 */
	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(8000));	// 1111101000000
		System.out.println(Integer.toOctalString(8000));	// 175
		System.out.println(Integer.toHexString(8000));     // 1f40
	}

}
