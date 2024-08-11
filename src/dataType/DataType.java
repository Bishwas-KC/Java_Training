package dataType;

public class DataType {
	
	/*
	 * -----------------Data Type-------------
	 * numberic and non-numberic
	 * 
	 * #proper data representation
	 * #proper memory allocation
	 * #proper operation to be perform
	 * 
	 * #Types : 
	 * #Primitive data Type
	 * 1. byte		// 1 byte
	 * 2. short		// 2 byte
	 * 3. int       // 4 byte   java c set default the value of number to int
	 * 4. long		// 8 byte
	 * 5. float		// 4 byte
	 * 6. double    // 8 bytes java c set default the value of decimal to double 
	 * 7. char		// 2 byte
	 * 8. boolean   // 1 bit
	 * 
	 * # Non-primitive Data type
	 * 1. String
	 * 2. Array
	 * 3. Classes
	 * 4. Collection
	 * 5. Enums
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		long x =8000000000l;  //(literal) we have define the value to javac  this is long using l
		
		//double p = 1.25;  // the low value can hold by float (memory Efficiency)
		float p = 1.25f;  // we have to define the value to javac using f at the end of the value
		
	/*
	 * -------------------------------------------------------
	 * | S.N |  Data Type |  Size   |  MIN_VALUE  | MAX_VALUE|
	 * -------------------------------------------------------
	 * |  1. |    byte    |   8 bit |   -128      |   +127   |
	 * -------------------------------------------------------
	 */
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t S.N \t | Data Type \t | Size \t | MIN_VALUE \t\t | MAX_VALUE \t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 1. "+"\t | byte "+"\t | "+(Byte.BYTES)+"\t\t |"+(Byte.MIN_VALUE)+"\t\t\t |"+(Byte.MAX_VALUE)+"\t\t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 2. "+"\t | char "+"\t | "+(Character.BYTES)+"\t\t |"+(Character.MIN_VALUE)+"\t\t\t |"+(Character.MAX_VALUE)+"\t\t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 3. "+"\t | short "+"\t | "+(Short.BYTES)+"\t\t |"+(Short.MIN_VALUE)+"\t\t |"+(Short.MAX_VALUE)+"\t\t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 4. "+"\t | int "+"\t\t | "+(Integer.BYTES)+"\t\t |"+(Integer.MIN_VALUE)+"\t\t |"+(Integer.MAX_VALUE)+"\t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 5. "+"\t | float "+"\t | "+(Float.BYTES)+"\t\t |"+(Float.MIN_VALUE)+"\t\t |"+(Float.MAX_VALUE)+"\t\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 6. "+"\t | long "+"\t | "+(Long.BYTES)+"\t\t |"+(Long.MIN_VALUE)+"\t |"+(Long.MAX_VALUE)+"\t |");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| \t 7. "+"\t | double "+"\t | "+(Double.BYTES)+"\t\t |"+(Double.MIN_VALUE)+"\t\t |"+(Double.MAX_VALUE)+" |");
		System.out.println("--------------------------------------------------------------------------------------------------");


		
	}
}
