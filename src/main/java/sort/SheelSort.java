package sort;

import java.util.Arrays;

/**
 * 希尔排序严格来说是基于插入排序的思想，又被称为缩小增量排序。
　　具体流程如下：
　　1、将包含n个元素的数组，分成n/2个数组序列，第一个数据和第n/2+1个数据为一对...
　　2、对每对数据进行比较和交换，排好顺序；
　　3、然后分成n/4个数组序列，再次排序；
　　4、不断重复以上过程，随着序列减少并直至为1，排序完成。
 *
 */
public class SheelSort {
	
	public static void main(String[] args) {
		int[] a = {2,4,3,5,4,6,56,-4};
		System.out.println(Arrays.toString(a));
		SheelSort.sheelSort(a);
	}
	
	public static void sheelSort(int[] arr) {
		int n = arr.length; //数组长度
		int increment = n / 2;
		for(;increment > 0; increment /= 2 ) {//间隔
			for(int i = increment;i < arr.length;i++) {
				int temp = arr[i];
				//从后往前开始比较每组数
				int j = 0;
				//从increment元素开始,逐个与间隔increment的元素比较
				for(j = i - increment;j >= 0;j -= increment) {
					if (arr[j] > temp) {
						arr[j + increment] = arr[j];
					}else {
						break;
					}
					
				}
				arr[j + increment] = temp;
			}
			System.out.println(Arrays.toString(arr));
			
			
		}
		for(int a:arr) {
			System.out.print(a + " ");
		}
	}
}












