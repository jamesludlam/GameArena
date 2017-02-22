public class Car
{
	private boolean right = true;
	private int noRectangles = 5;
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
	cars[0] = new Rectangle(x,y,60,20,"BLUE");
	cars[1] = new Rectangle(x-20,y+12,10,4,"GREEN");
	cars[2] = new Rectangle(x-20,y-12,10,4,"GREEN");
	cars[3] = new Rectangle(x+20,y+12,10,4,"GREEN");
	cars[4] = new Rectangle(x+20,y-12,10,4,"GREEN");
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
		for(int i=0;i<noRectangles;i++)
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
		for(int i=0;i<noRectangles;i++)
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
			if(cars[i].getXPosition()<-30)
				cars[i].setXPosition(cars[i].getXPosition() + 860);
			if(cars[i].getXPosition()>830)
				cars[i].setXPosition(cars[i].getXPosition() - 860);
		}
	}
}