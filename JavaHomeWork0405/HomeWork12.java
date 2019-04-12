
public class HomeWork12 {
	public static void main(String[] args) {
		int x=0;
		int y=0;
		int N=1;
		for( x=0;x<=20;x++){	
			
			
			for( y=0;y<=33;y++){
				int z=100-x-y;
				if((x*5)+(y*3)+(z/3)==100&&z%3==0){
					System.out.println(x);
					System.out.println(y);
					System.out.println(z);
					System.out.println(N++);
				}
				
				
				
				
			}
			
		}
		
		
		
		
	}
}
