
public class ArrayStructure {

	private int[] theArray = new int[50];

	private int arraySize = 10;

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 10) + 10;

		}

	}

	public void pauseAndUpdate() {

		try {

			Thread.sleep(700);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

	public int[] getTheArray() {
		return theArray;
	}

	public int getArraySize() {
		return arraySize;
	}

	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {

			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");

		}

	}

	public int getValueAtIndex(int index) {
		// need to check if the index in the range of the array
		if (index < arraySize)
			return theArray[index];
		return 0;

	}

	public boolean doesArrayContainThisValue(int searchValue) {

		boolean valueInArray = false;

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == searchValue) {
				valueInArray = true;
			}

		}

		return valueInArray;
	}

	public void deleteIndex(int index) {

		if (index < arraySize) {

			for (int i = index; i < (arraySize - 1); i++) {

				pauseAndUpdate();

				theArray[i] = theArray[i + 1];
			}

			arraySize--;
		}

	}

	public void insertValue(int value) {

		if (arraySize < theArray.length) { // theArray.length = 50 so the arraySize must be in the range of 50
			pauseAndUpdate();
			theArray[arraySize] = value;
			arraySize++;
		} else
			System.out.println("no room for new value");
		System.out.println(theArray.length);
	}

	public void printHorzArray(int i, int j) {

		for (int n = 0; n < 51; n++)
			System.out.print("-");
		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + theArray[n] + " ");
		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING
			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if (i != -1) {
			// ADD THE -1 TO FIX SPACING
			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);
		}

		System.out.println();
	}

	// This bubble sort will sort everything from
	// smallest to largest
	public void bubbleSortAescending() {

		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted
		for (int i = arraySize - 1; i > 0; i--) {
			// The inner loop starts at the beginning of
			// the array and compares each value next to each
			// other. If the value is greater then they are
			// swapped
			for (int j = 0; j < i; j++) {
				// To change sort to Descending change to <

				if (theArray[j] > theArray[j + 1]) {

					swapValues(j, j + 1);
				}
				//printHorzArray(i, j);
			}
		}

	}

	public void bubbleSortDescending() {

		// i starts at the beginning of the array

		for (int i = 0; i < arraySize; i++) {

			// The inner loop starts at the beginning of
			// the array 1 index in more than i.

			for (int j = 1; j < (arraySize - i); j++) {

				// Here we check if the 1st index is less
				// than the next during the first run through
				// Then we just increase the indexes until
				// they have all been checked

				if (theArray[j - 1] < theArray[j]) {

					swapValues(j - 1, j);

				}

			}

		}

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	public String linearSearchForValue(int value) {// Linear Search : Every index must be looked at

		boolean inArray = false;

		String foundInArray = "";

		System.out.print("The Value was Found in the Following: ");

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == value) {
				inArray = true;
				System.out.print(i + " ");
				foundInArray += i + " ";
			}
		}

		if (!inArray) {// inArray is false and this ! to make it true to enter
			foundInArray = "NONE"; // save the None in the founInArray variable
			System.out.println(foundInArray);// print the None
		}
		System.out.println();// print space at the end of the call
		return foundInArray;
	}

	public String binarySearchForValue(int value) {

		int lowIndex = 0;
		int highIndex = arraySize - 1;
		String foundInArray = "";

		while (lowIndex <= highIndex) {

			int middleIndex = highIndex + (highIndex - lowIndex) / 2;

			if (theArray[middleIndex] < value) {
//				foundInArray += middleIndex + " ";
				lowIndex = middleIndex + 1;
			}

			else if (theArray[middleIndex] > value) {
//				foundInArray += middleIndex + " ";
				highIndex = middleIndex - 1;
			}

			else {

				foundInArray += middleIndex + " ";
				System.out.println("\nFound a Match for " + value + " at Index " + foundInArray);

				lowIndex = highIndex + 1;

			}

			printHorzArray(-1, middleIndex);
			System.out.println("the high " + highIndex + " the low " + lowIndex + " the middle " + middleIndex);

		}
		return foundInArray;
	}

	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time
	public void selectionSort() {

		for (int i = 0; i < arraySize; i++) {

			int minimum = i;
			for (int j = i; j < arraySize; j++) {

				if (theArray[minimum] > theArray[j])
					minimum = j;

			}
			swapValues(i, minimum);
			printHorzArray(-1, i);
		}

	}

	public static void main(String[] args) {

		ArrayStructure newArray = new ArrayStructure();

		newArray.generateRandomArray();

//		JavaAlgorithms theView = new JavaAlgorithms();
//		ArrayStructure theModel = new ArrayStructure();

//		AlgorithmsController theController = new AlgorithmsController(theView, theModel);

//		theView.setVisible(true);

		//newArray.printArray();

		newArray.printHorzArray(9, 0);

		//newArray.deleteIndex(7);

		//newArray.insertValue(20);

	 	//System.out.println(newArray.getValueAtIndex(9));

	 	//System.out.println(newArray.doesArrayContainThisValue(17));

	 	//newArray.printHorzArray(1,6);

		 //newArray.linearSearchForValue(10);

		 //newArray.bubbleSort();

		 //newArray.printArray();

		 //newArray.printArray();

		 //We must Sort first

		 //newArray.binarySearchForValue(17);

		 //newArray.selectionSort();

		//newArray.insertionSort();
		//newArray.linearSearchForValue(11);
		newArray.bubbleSortAescending();
		//newArray.printHorzArray(-1, -1);
		//newArray.bubbleSortDescending();
		//newArray.printHorzArray(-1, -1);
		//newArray.binarySearchForValue(14);
		//newArray.printArray();
		//newArray.selectionSort();

	}

}
