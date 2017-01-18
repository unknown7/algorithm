package sort;

import java.util.Random;

public class BucketSort {
	public static void main(String[] args) {
		int[] books = new int[100];
		Random rand = new Random();
		
		// initialize
		for (int i = 0; i < 30; i++) {
			books[rand.nextInt(100)] += 1;
		}
		
		// low 2 high
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books[i]; j++) {
				if (i < 10) {
					System.err.print(" " + i + " ");
				} else {
					System.err.print(i + " ");
				}
			}
		}
		
		System.err.println();
		
		// high 2 low
		for (int i = books.length - 1; i >= 0; i--) {
			for (int j = 0; j < books[i]; j++) {
				if (i < 10) {
					System.err.print(" " + i + " ");
				} else {
					System.err.print(i + " ");
				}
			}
		}
	}
}
