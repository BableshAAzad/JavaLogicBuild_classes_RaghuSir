package Practice2.Day2;

import java.util.*;

public class ArrayArangement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 }; 
		int[] res = arraArrangeZigZack(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] arraArrangeZigZack(int[] arr) {
		Arrays.sort(arr);
		int end = arr.length / 2;
		
		Queue<Integer> ends = new LinkedList<Integer>();
		for (int i = arr.length - 1; i >= end; i--) {
			ends.add(arr[i]);
		}
		
		List<Integer> strs = new ArrayList<Integer>();
		for (int i = 0; i < end; i++) {
			strs.add(ends.poll());
			strs.add(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = strs.get(i);
		}
		return arr;
	}
}