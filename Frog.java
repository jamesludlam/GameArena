public class Frog
{
	private int noRectangles = 14;				
	Rectangle[] frogs = new Rectangle[noRectangles];
	public Frog()
	{
	frogs[0] = new Rectangle(400,750,20,30,"GREEN");	//body
	frogs[1] = new Rectangle(414,745,8,3,"GREEN");		//inner legs
	frogs[2] = new Rectangle(414,755,8,3,"GREEN");
	frogs[3] = new Rectangle(386,745,8,3,"GREEN");
	frogs[4] = new Rectangle(386,755,8,3,"GREEN");
	frogs[5] = new Rectangle(417,741,2,8,"GREEN");		// outer legs
	frogs[6] = new Rectangle(417,759,2,8,"GREEN");
	frogs[7] = new Rectangle(383,741,2,8,"GREEN");
	frogs[8] = new Rectangle(383,759,2,8,"GREEN");
	frogs[9] = new Rectangle(400,753,16,18,"YELLOW");	//back
	frogs[10] = new Rectangle(406,740,4,4,"WHITE");		//white eyes
	frogs[11] = new Rectangle(394,740,4,4,"WHITE");
	frogs[12] = new Rectangle(406,740,2,2,"BLACK");		//black eyes
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
		for(int i=noRectangles-1;i>-1;i--)
		{
			frogs[i].setXPosition(frogs[i].getXPosition() - frogs[0].getXPosition() + XPos);
		}
	}
	public void setYPosition(double YPos)
	{
		for(int i=noRectangles-1;i>-1;i--)
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