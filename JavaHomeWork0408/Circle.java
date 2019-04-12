import java.awt.Point;
import java.util.Scanner;


public class Circle{	
	Point p;
	int  r;
	
	public  Circle(Point p,int r){
		this.p=p;
		this.r=r;
		
	}
	public double getSquare(){
		
		
		return Math.PI*r*r;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("please input your r:");
		int r = scanner.nextInt();
		System.out.print("please input your px:");
		int x1 = scanner.nextInt();
		System.out.print("please input your py:");
		int y1 = scanner.nextInt();
		Circle circle=new Circle(new Point(x1,y1),r);
		System.out.print("please input your p2x:");
		int x2 = scanner.nextInt();
		System.out.print("please input your p2y:");
		int y2 = scanner.nextInt();
		double M=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(M<=r){
			System.out.println("áÜØ¡");
		}else{
			System.out.println("²»Ì«áÜØ¡");
		}
		
		System.out.println(circle.getSquare()); 
		
		 
	}
}
