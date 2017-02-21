public class Car
{
	private boolean right = true;
	private double velocity = 1;
	private int noRectangles = 5;
	private int nocircles = 0;
	public int GetNoRectangles()
	{
		return noRectangles;
	}
	
	Rectangle[] cars = new Rectangle[5];

	public Car(double x,double y)
	{
	cars[0] = new Rectangle(x,y,60,20,"BLUE");
	cars[1] = new Rectangle(x-20,y+12,10,4,"GREEN");
	cars[2] = new Rectangle(x-20,y-12,10,4,"GREEN");
	cars[3] = new Rectangle(x+20,y+12,10,4,"GREEN");
	cars[4] = new Rectangle(x+20,y-12,10,4,"GREEN");

	}
	
	public double GetXPos()
	{
		return cars[0].getXPosition();
	}
	public void SetXPos(double XPos)
	{
		for(int i=0;i<noRectangles;i++)
		{
			cars[i].setXPosition(cars[i].getXPosition() - cars[0].getXPosition() + XPos);
		}
	}
	public double GetYPos()
	{
		return cars[0].getYPosition();
	}
	public void SetYPos(double YPos)
	{
		for(int i=0;i<noRectangles;i++)
		{
			cars[i].setYPosition(cars[i].getYPosition() - cars[0].getYPosition() + YPos);
		}
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
		for (int i=0;i<noRectangles;i++)
		{
			if(right)
				cars[i].setXPosition(cars[i].getXPosition() + velocity);
			else
				cars[i].setXPosition(cars[i].getXPosition() - velocity);
			if(cars[i].getXPosition()<-30)
				cars[i].setXPosition(cars[i].getXPosition() + 860);
			if(cars[i].getXPosition()>830)
				cars[i].setXPosition(cars[i].getXPosition() - 860);
		}
	}
}