public class Frog
{
	private int noRectangles = 14;				
	Rectangle[] frogs = new Rectangle[noRectangles];
	public Frog()
	{
	frogs[0] = new Rectangle(400,750,20,30,"GREEN");
	frogs[1] = new Rectangle(415,745,10,3,"GREEN");
	frogs[2] = new Rectangle(415,755,10,3,"GREEN");
	frogs[3] = new Rectangle(385,745,10,3,"GREEN");
	frogs[4] = new Rectangle(385,755,10,3,"GREEN");
	frogs[5] = new Rectangle(419,741,2,8,"GREEN");
	frogs[6] = new Rectangle(419,759,2,8,"GREEN");
	frogs[7] = new Rectangle(381,741,2,8,"GREEN");
	frogs[8] = new Rectangle(381,759,2,8,"GREEN");
	frogs[9] = new Rectangle(400,753,16,18,"YELLOW");
	frogs[10] = new Rectangle(406,740,4,4,"WHITE");
	frogs[11] = new Rectangle(394,740,4,4,"WHITE");
	frogs[12] = new Rectangle(406,740,2,2,"BLACK");
	frogs[13] = new Rectangle(394,740,2,2,"BLACK");
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
			frogs[i].setYPosition(frogs[i].getYPosition() - 50);
		}
	}
	public void left()
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() - 50);
		}
	}
	public void right()
	{
		for(int i=0;i<noRectangles;i++)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() + 50);
		}
	}
}