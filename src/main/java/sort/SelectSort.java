package sort;

import java.util.Arrays;

/**
 * 简单选择排序:
 * 首先遍历一遍数组，将最小的数排在最前面，
 * 再遍历剩下的数，将第二小的数排在第二位
 * 依次循环遍历。
 * 循环遍历的次数：length-1
 * @author x1c
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {3,4,454,5,-4,-3,32};
		selectSort(arr);
	}
	
	public static void selectSort(int[] arr) {
		//循环的次数,i表示要插入的位置
		for(int i = 0;i < arr.length;i++) {
			int position = i;//记录较小的数的位置
			int temp = arr[i];//记录较小的数
			for(int j = i + 1;j < arr.length;j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
}






