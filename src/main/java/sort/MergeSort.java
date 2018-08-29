package sort;

import java.util.Arrays;

/**
 * 归并排序:
 * @author x1c
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] data = {23,45,76,9,-67,34,-3,12};
		mergeSort(data, 0, data.length-1);
	}
	/*
	 * 
	 */
	public static void mergeSort(int[] data,int left,int right) {
		if (left < right) {
			int middle = (left+right)/2;
			mergeSort(data, left, middle);
			mergeSort(data, middle+1, right);
			merge(data, left, middle, right);
		}
	}
	/*
	 * 将数组分为两个数组，记录最左的索引和最右的索引，中间的索引。
	 * 当左边索引小，将其插入中间数组，反之亦然。
	 * 当左边或右边的数组没有数字，将剩下的那个数组的数插入中间数组
	 */
	public static void merge(int[] data,int left,int center,int right) {
		int[] tempData = new int[data.length];
		int middle = center + 1;
		int thrid = left;//记录中间数组的索引
		int temp = left;//用于将中间数组中的值赋给原数组
		while(left <= center && middle <= right) {
			if (data[left] < data[middle]) {
				tempData[thrid++] = data[left++];
			}else {
				tempData[thrid++] = data[middle++];
			}
			
		}
		while(left <= center) {
			tempData[thrid++] = data[left++];
		}
		while(middle <= right) {
			tempData[thrid++] = data[middle++];
		}
		//将排好的数组返回给原数组
		while(temp <= right) {
			data[temp] = tempData[temp++];
		}
		System.out.println(Arrays.toString(data));
	}
}








