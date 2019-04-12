import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		char []char1={'统','计','一','个','字','符','在','数','组','中','的','位','置'};
		int[] ary=countAll(char1,'字');
		System.out.println(Arrays.toString(ary));
	}
	public static int[] countAll(char[] ary,char ch){
		
		for(int i=0;i<=char1.length();i++){
			char c=char1.charAt(i);
			if(c==ch){
				ary=Arrays.copyOf(ary, ary.length+1);
				ary[ary.length-1]=1;
			}
				
				
				
				
				
				
				
			}
			
			
		}
		
		
		
	}
}
