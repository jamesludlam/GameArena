<<<<<<< HEAD
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
			xposition += velocity;
		else
			xposition -= velocity;
		if(xposition<-30)
			xposition = 830;
		if(xposition>830)
			xposition = -30;
	}
=======
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
>>>>>>> b8081a8c3eda7cf338c9f24424273ff23b3e1d99
}