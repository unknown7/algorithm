package sort;

import java.util.Arrays;

import generator.Generated;
import generator.Generator;
import generator.RandomGenerator;

public class QuickSort {
	public static void main(String[] args) {
		Integer[] a = Generated.array(new RandomGenerator.Integer(100), Integer.class, 20);
		sort(a, 0, a.length - 1, Generator.Order.DESC);
		System.err.println(Arrays.toString(a));
	}
	
	public static void sort(Integer[] a, Integer left, Integer right, Generator.Order order) {
		if (left > right) return;
		
		int i = left, j = right, t = a[i];
		while (i != j) {
			switch (order) {
			default:
			case ASC:
				while (a[j] >= t && i < j)
					j--;
				while (a[i] <= t && i < j)
					i++;
				break;
			case DESC:
				while (a[j] <= t && i < j)
					j--;
				while (a[i] >= t && i < j)
					i++;
				break;
			}
			if (i < j)
				swap(a, i, j);
		}

		a[left] = a[i];
		a[i] = t;
		
		sort(a, left, i - 1, order);
		sort(a, i + 1, right, order);
	}
	
	public static void swap(Integer[] a, Integer x, Integer y) {
		a[x] = a[x] ^ a[y];
		a[y] = a[x] ^ a[y];
		a[x] = a[x] ^ a[y];
	}
}
