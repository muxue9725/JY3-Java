import java.util.Arrays;
public class combineArrText06 {
	public static void main(String[] args) {
		int[] A={1,7,9,11,13,15,17,19};
		int[] B={2,4,5,8,10};
		int[] arr=new int[13];
		//分别是原数组 原数组开始 目标数组 目标数组开始 复制长度
		System.arraycopy(A,0,arr,0,8);
		//把两个INT数组放到DEST数组中
		//System.out.println(Arrays.toString(arr));
		System.arraycopy(B,0,arr,8,5);
		arr=selectionSort (arr);
		
		
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
