
public class Vehicle {
	int speed;
	double size;
	//无参数方法
	public Vehicle(){
		
	}
	//有参数方法
	public Vehicle(double speed,double size){
		this.size=size;
		this.speed=(int) speed;
	}
	public double SetSpeed(Vehicle avehicle){
		move move=new move();
		move.SetSpeed(this, avehicle);
		return speed;
				
	}
	
}
