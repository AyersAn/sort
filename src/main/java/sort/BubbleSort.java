package sort;

import java.util.Arrays;

/**
 * 冒泡排序:
 * 	将待排序数组相邻的数两两比较,
 * 	若是前面的数大,则交换数据,这样最大的数就到最下面
 * @author x1c
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,34,56,7,-9,4,0,34};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length;i++) {//要比较的次数
			for(int j = 0;j < arr.length-1-i;j++) {//要比较的数
				int temp = arr[j];
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}











