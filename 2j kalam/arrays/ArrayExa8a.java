public class ArrayExa8a {
	
	public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return arr[lowIndex];
		}
		int midIndex = (lowIndex + highIndex)/2;
		
		int val1 = maxInRange(arr, lowIndex, midIndex);
		int val2 = maxInRange(arr, midIndex+1, highIndex);
		
		if (val1 > val2) {
			return val1;
		} else {
			return val2; 
		} 
	}
	
	public static int max(int[] arr) {
		return maxInRange(arr, 0, arr.length-1); 
	}
	
	public static int findInRange(int[] arr, int target, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			if (arr[lowIndex] == target) {
				return lowIndex;
			}
			else {
				return -1; 
			}
		}
		
		int midIndex = (lowIndex + highIndex)/2;
		int val1 = findInRange(arr, target, lowIndex, midIndex);
		if (val1 >= 0) {
			return val1;
		} 
		return findInRange(arr, target, midIndex + 1, highIndex);
	}
	
	public static int find(int[] arr, int target) {
		return findInRange(arr, target, 0, arr.length-1); 
	}
}