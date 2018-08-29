package sort;

import java.util.Arrays;

/**
 * 快速排序:
 * 	选择一个基准元素(一般第一或最后一个),
 * 	扫描,将比基准元素小的数排在基准元素前面,大的则排在后面,
 *  则基准元素在正确的位置.
 * 	递归的调用此方法
 * @author x1c
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {23,4,6,7,86,34,-67,-56,34,-6};
		System.out.println(Arrays.toString(arr));
		quick(arr);
	}
	public static void quick(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	public static void quickSort(int[] arr,int low,int high) {
		if (low < high) {
			int middle = getMiddle(arr, low, high);
			quickSort(arr, low, middle-1);
			quickSort(arr, middle+1, high);
		}
	}
	public static int getMiddle(int[] arr,int low,int high) {
		int temp = arr[low];
		while(low < high) {
			
			while(low < high && arr[high] > temp) {
				high --;
			}
			arr[low] = arr[high];
			while(low < high && arr[low] < temp) {
				low ++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		System.out.println(Arrays.toString(arr));
		return low;
	}
}
