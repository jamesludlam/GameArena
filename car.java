public class car
{
	private double xposition = 400;
	private double yposition = 50;
	private boolean right = true;
	private double velocity = 1;
	Rectangle car = new Rectangle(xposition,yposition,60,20,"BLUE");
	public double GetXPos()
	{
		return xposition;
	}
	public void SetXPos(double XPos)
	{
		xposition = XPos;
	}
	public double GetYPos()
	{
		return yposition;
	}
	public void SetYPos(double YPos)
	{
		yposition = YPos;
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