package structure;

public class Decode {
	public static void main(String[] args) {
		int[] a = { 6, 3, 1, 7, 5, 8, 9, 2, 4 };
		Queue q = new Queue(101);
		q.head = 0;
		q.tail = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			q.a[i] = a[i];
		}
		
		while (q.head <= q.tail) {
			int t = q.a[q.head];
			System.err.print(t);
			q.head++;
			q.tail++;
			q.a[q.tail] = q.a[q.head];
			q.head++;
		}
	}
}
