package sortingAlgorithms;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void bubbleSort(int[] arr, int n) {

		int temp;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}

			}
			if (swapped == false) {
				break;
			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
