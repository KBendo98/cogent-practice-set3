package exercises3;

public class BinarySearch {

	public static void main(String[] args) {
		// Must be sorted
		int[] arr = {1, 5, 7, 10, 20, 23, 35, 65};
		
	    int target = 23;
	    int index = binarySearch(arr, target);
	    
	    if (index != -1) {
	      System.out.println("Found at index: " + index);
	    } else {
	      System.out.println("Not Found.");
	    }
	}
	
	public static int binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length-1;
		
		// Loop stops when left > right
		while(left <= right) {
			int mid = (left+right)/2;
			
			// Found the target
			if(arr[mid] == num)
				return mid;
			// Narrow search to the left
			else if(arr[mid] > num)
				right = mid - 1;
			// Narrow search to the right
			else {
				left = mid + 1;
			}
		}
		
		// Not found
		return -1;
	}
}
