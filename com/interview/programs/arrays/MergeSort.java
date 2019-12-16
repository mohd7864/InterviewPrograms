package com.interview.programs.arrays;

public class MergeSort {

	public void mergeSort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public void merge(int[] arr, int start, int mid, int end) {

		int m = mid - start + 1;
		int n = end - mid;

		int leftArr[] = new int[m];
		int rightArr[] = new int[n];

		for (int i = 0; i < m; i++) {
			leftArr[i] = arr[start + i];
		}
		for (int j = 0; j < n; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = start;
		while (i < m && j < n) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < m) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < n) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		MergeSort m = new MergeSort();
		m.mergeSort(arr, 0, arr.length-1);
		m.print(arr);

	}

}
