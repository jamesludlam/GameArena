public class Car
{
	private boolean right = true;
	private double velocity = 1;
	private int norectangles = 1;
	private int nocircles = 0;
	
	
	Rectangle[] cars = new Rectangle[2];

//	cars[0] = Rectangle(400,50,60,20,"BLUE");
	public Car(double x,double y)
	{
	cars[0] = new Rectangle(x,y,60,20,"GREEN");
	cars[1] = new Rectangle(100,50,60,20,"GREEN");		
	}
	
	public double GetXPos()
	{
		return cars[0].getXPosition();
	}
	public void SetXPos(double XPos)
	{
		cars[0].setXPosition(XPos);
	}
	public double GetYPos()
	{
		return cars[0].getYPosition();
	}
	public void SetYPos(double YPos)
	{
		cars[0].setYPosition(YPos);
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
			cars[0].setXPosition(cars[0].getXPosition() + velocity);
		else
			cars[0].setXPosition(cars[0].getXPosition() - velocity);
		if(cars[0].getXPosition()<-30)
			cars[0].setXPosition(cars[0].getXPosition() + 860);
		if(cars[0].getXPosition()>830)
			cars[0].setXPosition(cars[0].getXPosition() - 860);
	}
}