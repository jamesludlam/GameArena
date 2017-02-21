public class car
{
	private boolean right = true;
	private double velocity = 1;
	Rectangle car = new Rectangle(400,50,60,20,"BLUE");
	public double GetXPos()
	{
		return car.getXPosition();
	}
	public void SetXPos(double XPos)
	{
		car.setXPosition(XPos);
	}
	public double GetYPos()
	{
		return car.getYPosition();
	}
	public void SetYPos(double YPos)
	{
		car.setYPosition(YPos);
	}
	public double GetVel()
	{
		return velocity;
	}
	public void SetVel(double Vel)
	{
		velocity = Vel;
	}
	public void move()
	{
		if(right)
			car.setXPosition(car.getXPosition() + velocity);
		else
			car.setXPosition(car.getXPosition() - velocity);
		if(car.getXPosition()<-30)
			car.setXPosition(car.getXPosition() + 860);
		if(car.getXPosition()>830)
			car.setXPosition(car.getXPosition() - 860);
	}
}