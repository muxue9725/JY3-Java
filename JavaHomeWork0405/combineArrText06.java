import java.util.Arrays;
public class combineArrText06 {
	public static void main(String[] args) {
		int[] A={1,7,9,11,13,15,17,19};
		int[] B={2,4,5,8,10};
		int[] arr=new int[13];
		//�ֱ���ԭ���� ԭ���鿪ʼ Ŀ������ Ŀ�����鿪ʼ ���Ƴ���
		System.arraycopy(A,0,arr,0,8);
		//������INT����ŵ�DEST������
		//System.out.println(Arrays.toString(arr));
		System.arraycopy(B,0,arr,8,5);
		arr=selectionSort (arr);
		
		
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
