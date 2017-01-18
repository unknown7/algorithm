package sort;

import java.util.Arrays;

import generator.Generated;
import generator.Generator;
import generator.RandomGenerator;

public class BubbleSort {
	public static void main(String[] args) {
		Integer[] a = Generated.array(new RandomGenerator.Integer(100), Integer.class, 20);
		sort(a, Generator.Order.ASC);
		System.err.println(Arrays.toString(a));
	}
	
	public static void sort(Integer[] a, Generator.Order order) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				switch (order) {
				default:
				case ASC:
					if (a[i] > a[j]) swap(a, i, j);
					break;
				case DESC:
					if (a[i] < a[j]) swap(a, i, j);
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
