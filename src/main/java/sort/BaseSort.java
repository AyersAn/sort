package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 基数排序算法：
 * 	1.先找到最大数，计算需要排序多少次
 *  2.建立十个列表
 *  3.依次找到个位到最高位的数，按照数的大小将该位数添加进链表
 *  4.将链表中的数依次倒入原数组
 *  结束
 * @author x1c
 *
 */
public class BaseSort {
	public static void main(String[] args) {
		int[] data = {46,34,24,78,9,5,54};
		baseSort(data);
	}
	
	public static void baseSort(int[] data) {
		//1.确定排序的次数
		int max = data[0];
		for(int a : data) {
			if (a > max) {
				max = a;
			}
		}
		//System.out.println(max);
		//2.确定位数
		int time = 0;
		while(max > 0) {
			time++;
			max /= 10;
		}
		//3.建立是个队列，对应0-9的数
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i < 10;i++) {
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list.add(list2);
		}
		//4.将每个数按照个位到最高位。依次排好序
		for(int i = 0;i < time;i++) {
			for(int j = 0;j < data.length;j++) {
				int num =  data[j] % (int)Math.pow(10, i+1) / (int)Math.pow(10, i);
				ArrayList<Integer> list3 = list.get(num);
				list3.add(data[j]);
				list.set(num, list3);
			}
			//将对应列表中的每个数按先进先出取出，存入数组
			int count = 0;//计数器，
			for(int k = 0;k < 10;k++) {
				while(list.get(k).size() > 0) {
					ArrayList<Integer> list4 = list.get(k);
					data[count] = list4.get(0);
					list4.remove(0);
					count++;
				}
			}
			System.out.println("第"+(i+1)+"遍排序："+Arrays.toString(data));
		}
		
		
		System.out.println("排好序："+Arrays.toString(data));
	}
}










