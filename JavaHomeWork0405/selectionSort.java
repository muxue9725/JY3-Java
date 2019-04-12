import java.util.Arrays;
//选择排序练习 从左到右递增


public class selectionSort {
	public static void main(String[] args) {
		int[] arr = {10,20,1,-3,4};
		arr = selectionSort (arr);
		System.out.println(Arrays.toString(arr));
	}
	//选择排序
	public static int[] selectionSort(int[] arr){
		
		//两个循环互相嵌套 i =第一个数据的位置；j=代码后部每一位数据位置
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					
				}
				
			}
			
			
		}
		return arr;
		
	}
}
