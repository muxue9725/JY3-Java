
public class Vehicle {
	int speed;
	double size;
	//�޲�������
	public Vehicle(){
		
	}
	//�в�������
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
