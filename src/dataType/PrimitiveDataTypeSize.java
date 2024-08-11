package dataType;

public class PrimitiveDataTypeSize {
	public static void main(String[] args) {
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
