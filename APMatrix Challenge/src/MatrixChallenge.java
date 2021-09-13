
public class MatrixChallenge {

	static int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8},
			{6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 0}, {2, 5, 1, 7, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
	
	public static void main(String[] args) {
		
				
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				System.out.print(myArray[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe maximum number in the matrix is " + maxNum(0));
		System.out.println("\nThe minimum number in the matrix is " + minNum(0));
		System.out.println("\nThe average number in the matrix is " + );
		
	}
	
	public static int maxNum(int max) {
		max = myArray[0][0];
		
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				if (myArray[row][col] > max) {
					max = myArray[row][col];
				}
			}
		}
		return max;
	}
	
	public static int minNum(int min) {
		min = myArray[0][0];
		
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				if (myArray[row][col] < min) {
					min = myArray[row][col];
				}
			}
		}
		
		return min;
	}

}
