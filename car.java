public class car
{
	private double xposition = 400;
	private double yposition = 400;
	private boolean right = true;
	private double velocity = 0.01;
	Rectangle car = new Rectangle(xposition,yposition,30,10,"BLUE");
	public double GetXPos()
	{
		return xposition;
	}
	public double GetYPos()
	{
		return yposition;
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
			xposition += velocity;
		else
			xposition -= velocity;
	}
}