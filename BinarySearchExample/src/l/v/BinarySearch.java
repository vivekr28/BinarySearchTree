package l.v;

/**
 * 
 * 
 * @author Vivek
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param n number to be searched
	 * @param a sorted array from which number is to be searched
	 * @return index position of the number if found in the array else -1
	 */
	public static int doBinarySearch(int n, int[] a) {

		return doBinarySearch(n, a, 0, a.length - 1);
	}

	private static int doBinarySearch(int a1, int[] aa, int start, int end) {

		if (start > end) // signals that number is not present in the array
			return -1;
		int mid = (end - start + 1) / 2 + start;

		if (a1 < aa[mid]) {
			end = mid - 1;
		} else if (a1 > aa[mid]) {
			start = mid + 1;
		} else
			return mid;

		return doBinarySearch(a1, aa, start, end); // recursive call to the
													// doBinarySearch method
	}

}
