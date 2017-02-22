public class Car
{
	private boolean right = true;
	private int noRectangles = 6;
	private int nocircles = 0;
	private double velocity;
	public int getNoRectangles()
	{
		return noRectangles;
	}
	
	Rectangle[] cars = new Rectangle[noRectangles];

	public Car(double x,double y,boolean z,double w)
	{
	velocity = w;
	right = z;
	cars[0] = new Rectangle(x,y,60,20,colour());
	cars[1] = new Rectangle(x-20,y+12,10,4,"GRAY");
	cars[2] = new Rectangle(x-20,y-12,10,4,"GRAY");
	cars[3] = new Rectangle(x+20,y+12,10,4,"GRAY");
	cars[4] = new Rectangle(x+20,y-12,10,4,"GRAY");
	if(z)
		cars[5] = new Rectangle(x+20,y,12,15,"LIGHTGRAY");
	else
		cars[5] = new Rectangle(x-20,y,12,15,"LIGHTGRAY");
	}
	public void changeColour()
	{
		cars[0].setColour(colour());
	}
	public boolean getRight()
	{
		return right;
	}
	public void setRight(boolean a)
	{
		right = a;
	}
	public double getXPos()
	{
		return cars[0].getXPosition();
	}
	public void SetXPos(double XPos)
	{
		for(int i=noRectangles-1;i>-1;i--)
		{
			cars[i].setXPosition(cars[i].getXPosition() - cars[0].getXPosition() + XPos);
		}
	}
	public double getYPos()
	{
		return cars[0].getYPosition();
	}
	public void SetYPos(double YPos)
	{
		for(int i=noRectangles-1;i>-1;i--)
		{
			cars[i].setYPosition(cars[i].getYPosition() - cars[0].getYPosition() + YPos);
		}
	}
	public double getVel()
	{
		return velocity;
	}
	public void setVel(double Vel)
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
			if(cars[i].getXPosition()<-100)
			{
				cars[i].setXPosition(cars[i].getXPosition() + 1000);
				changeColour();
			}
			if(cars[i].getXPosition()>900)
			{
				cars[i].setXPosition(cars[i].getXPosition() - 1000);
				changeColour();
			}
		}
	}
	private String colour()
	{
		int colournumber = (int)(5*Math.random());
		if(colournumber == 0)
			return "BLUE";
		if(colournumber == 1)
			return "RED";
		if(colournumber == 2)
			return "CYAN";
		if(colournumber == 3)
			return "ORANGE";
		return "WHITE";
	}
}