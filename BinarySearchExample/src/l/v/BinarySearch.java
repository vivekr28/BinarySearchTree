package l.v;

public class BinarySearch {

	int[] a = new int[10000001];

	public BinarySearch() {
		for (int i = 0; i < 10000001; i++) {
			a[i] = i;
		}
	}

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		long t1 = System.currentTimeMillis();

		t1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			bs.doBinarySearch(1, bs.a, 0, bs.a.length - 1);
		}
		System.out.println("Time taken to binary search :"
				+ (System.currentTimeMillis() - t1));

	}

	int doBinarySearch(int a1, int[] aa, int start, int end) {

		if (start > end)
			return -1;
		int mid = (end - start + 1) / 2 + start;

		if (a1 < aa[mid]) {
			end = mid - 1;
		} else if (a1 > aa[mid]) {
			start = mid + 1;
		} else
			return mid;

		return doBinarySearch(a1, aa, start, end);

		// return -1;
	}

}
