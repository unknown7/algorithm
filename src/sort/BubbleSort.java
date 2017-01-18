package sort;

import java.util.Arrays;

import generator.Generated;
import generator.Generator;
import generator.RandomGenerator;

public class BubbleSort {
	public static void main(String[] args) {
		Integer[] arr = Generated.array(new RandomGenerator.Integer(100), Integer.class, 20);
		sort(arr, Generator.Order.ASC);
		System.err.println(Arrays.toString(arr));
	}
	
	public static void sort(Integer[] orig, Generator.Order order) {
		for (int i = 0; i < orig.length; i++) {
			for (int j = i + 1; j < orig.length; j++) {
				switch (order) {
				default:
				case ASC:
					if (orig[i] > orig[j]) swap(orig, i, j);
					break;
				case DESC:
					if (orig[i] < orig[j]) swap(orig, i, j);
					break;
				}
			}
		}
	}
	
	public static void swap(Integer[] a, Integer x, Integer y) {
		a[x] = a[x] ^ a[y];
		a[y] = a[x] ^ a[y];
		a[x] = a[x] ^ a[y];
	}
}
