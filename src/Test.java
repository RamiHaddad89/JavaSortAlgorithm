
public class Test {

	public static void main(String[] args) {
		int arraySize = 10;
		int[] theArray = { 11, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int j = 0;
		int i = 0;
		
		if (j != -1) {
			// ADD THE +2 TO FIX SPACING
			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE
		
		if(i != -1){
			// ADD THE -1 TO FIX SPACING
			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

			System.out.print(i);
		}
		
		System.out.println("\n\n"+(j*5)+2);
		System.out.println("\n\n"+(5*(i - j)-1));
		for(int n = 0; n < 51; n++)System.out.print("-");
		System.out.println();
		for(int n = 0; n < arraySize; n++){
			
			System.out.print("| " + n + "  ");
		
		}
		System.out.println("|");
		for(int n = 0; n < arraySize; n++){
			
			System.out.print("| " + theArray[n] + " ");
		}

		System.out.println("|");
	}

}
