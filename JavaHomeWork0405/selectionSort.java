import java.util.Arrays;
//ѡ��������ϰ �����ҵ���


public class selectionSort {
	public static void main(String[] args) {
		int[] arr = {10,20,1,-3,4};
		arr = selectionSort (arr);
		System.out.println(Arrays.toString(arr));
	}
	//ѡ������
	public static int[] selectionSort(int[] arr){
		
		//����ѭ������Ƕ�� i =��һ�����ݵ�λ�ã�j=�����ÿһλ����λ��
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
