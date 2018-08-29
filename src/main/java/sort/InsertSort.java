package sort;

import java.util.Scanner;

/**
 * 直接插入排序:
 * 	在前面的已经排好序的数中插入,
 *  待插入数从最后一个数开始比较,若前面的数大,则将前面的数后移一位,
 *  循环,直到前面的数不大于后面的数,
 *  将待插入数插入比较的后一位.
 * @author x1c
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int[] a = {2,-3,23,1,2,0};
		InsertSort.insertSort(a);
	}
	
	/*
	 * 直接插入排序:
	 * 假设前面n-1个数已经排好序,将第n个数插入
	 */
	public static void insertSort(int[] a) {
		int l = a.length;  	//排序数组长度
		System.out.println("排序前的数组:");
		for(int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i = 1;i < l;i++) {
			int temp = a[i]; //待插入数
			//if (a[i] < a[i-1]) {
			//先从待插入前一个数开始比较
				int j = i - 1;	
				for(;j >= 0 && a[j] > temp;j--) {
					a[j+1] = a[j];
				}
				//将待插入数插入
				a[j+1] = temp;
				
			//}
		}
		
		System.out.println("排序后的数组:");
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	
}


