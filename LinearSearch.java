package search;

public class LinearSearch {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int tar = 11;
		boolean b = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == tar) {
				b = false;
				System.out.println(tar + " is founded in indexof: " + i);
			}
		}
		if (b == true)
			System.out.println(tar + " is not founded");
	}

}
