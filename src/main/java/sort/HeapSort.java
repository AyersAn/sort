package sort;
/**
 * 堆排序:小顶堆
 * 1.交换方法
 * 2.构建小顶堆
 * 	2.1:从最后一个数开始,找到父节点,与父节点比较,若子节点小则交换
 * 3.将最后一个数跟根节点交换,去掉最后一个数,再构建小顶堆
 * @author x1c
 *
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = {3,45,54,78,34,33};
		HeapSort sort = new HeapSort();
		System.out.println("初始堆:");
		sort.print(arr);
		System.out.println();
		for(int i = 0;i < arr.length;i++) {
			//每次构建完堆,最小数调到最后,需构建小顶堆的数少一位
			HeapSort.createLittleHeap(arr, arr.length-1-i);
			HeapSort.swap(arr, 0, arr.length-1-i);//第一个数跟最后一个数交换
			sort.print(arr);
			System.out.println();
		}
	}
	
	
	//构建小顶堆
	public static void createLittleHeap(int[] arr,int last) {
		for(int i = last;i > 0;i--) {
			int parent = (i-1)/2;
			if (arr[parent] > arr[i]) 
				swap(arr, parent, i);
		}
	}
	
	//交换数组中的元素
	public static void swap(int[] data,int i,int j) {
		if (i == j) {
			return;
		}
		/*int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = arr[a];*/
		data[i] = data[i] + data[j];    
        data[j] = data[i] - data[j];    
        data[i] = data[i] - data[j];  
	}
	//输出数组
	public void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  

    }  
}








