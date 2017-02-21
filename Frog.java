public class Frog
{
	private int noRectangles = 1;				
	Rectangle[] frogs = new Rectangle[noRectangles];

	public Frog()
	{
	frogs[0] = new Rectangle(400,750,60,60,"GREEN");	
	}
	public int getNoRectangles()
	{
		return noRectangles;
	}
	public double getXPosition()
	{
		return frogs[0].getXPosition();
	}
	public double getYPosition()
	{
		return frogs[0].getYPosition();
	}
	public void setXPosition(double XPos)
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() - frogs[0].getXPosition() + XPos);
		}
	}
	public void setYPosition(double YPos)
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setYPosition(frogs[i].getYPosition() - frogs[0].getYPosition() + YPos);
		}
	}
	public void up()
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setYPosition(frogs[i].getYPosition() - 5);
		}
	}
	public void left()
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() - 5);
		}
	}
	public void right()
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() + 5);
		}
	}
}