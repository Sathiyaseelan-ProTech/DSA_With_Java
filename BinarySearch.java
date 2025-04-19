package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = { 7, 8, 1, 5, 3, 2, 6, 9, 4 };
		Arrays.sort(a);
		System.out.println("Enter a number to find :");
		int tar = sc.nextInt();
		int low = 0;
		int high = a.length - 1;
		int tar1 = 0;
		int ti = 0;
		while (low <= high) {
			ti += 1;
			int mid = (low + high) / 2;
			if (tar == a[mid]) {
				tar1 = tar;
				System.out.println(tar + " is founded.");
				System.out.println("Founded in " + ti + "nd time search");
				break;
			} else if (tar > a[mid]) {
				low = mid + 1;
			} else if (tar < a[mid]) {
				high = mid - 1;
			}

		}
		if (tar1 != tar) {
			System.out.println(tar + " is Absent in the Array!");
		}

	}
}
