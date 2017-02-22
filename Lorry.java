public class Lorry
{
	private boolean right = true;
	private int noRectangles = 11;
	private int nocircles = 0;
	private double velocity;
	public int getNoRectangles()
	{
		return noRectangles;
	}
	
	Rectangle[] lorrys = new Rectangle[noRectangles];

	public Lorry(double x,double y,boolean z,double w)
	{
		velocity = w;
		right = z;
		lorrys[0] = new Rectangle(x,y,100,26,colour());		//main body
		lorrys[1] = new Rectangle(x-40,y+14,10,2,"GRAY");	//wheels
		lorrys[2] = new Rectangle(x-40,y-14,10,2,"GRAY");
		lorrys[3] = new Rectangle(x+40,y+14,10,2,"GRAY");
		lorrys[4] = new Rectangle(x+40,y-14,10,2,"GRAY");
		lorrys[5] = new Rectangle(x-26,y+14,10,2,"GRAY");
		lorrys[6] = new Rectangle(x-26,y-14,10,2,"GRAY");
		lorrys[7] = new Rectangle(x+26,y+14,10,2,"GRAY");
		lorrys[8] = new Rectangle(x+26,y-14,10,2,"GRAY");
		if(z)
		{
			lorrys[9] = new Rectangle(x+43,y,6,18,"LIGHTGRAY");	//windscreen
			lorrys[10] = new Rectangle(x+25,y,1,26,"BLACK");	//trailer seperator
		}
		else
		{
			lorrys[9] = new Rectangle(x-43,y,6,18,"LIGHTGRAY");	//windscreen
			lorrys[10] = new Rectangle(x-25,y,1,26,"BLACK");	//trailer seperator
		}
	}
	public void changeColour()
	{
		lorrys[0].setColour(colour());
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
		return lorrys[0].getXPosition();
	}
	public void SetXPos(double XPos)
	{
		for(int i=noRectangles-1;i>-1;i--)
		{
			lorrys[i].setXPosition(lorrys[i].getXPosition() - lorrys[0].getXPosition() + XPos);
		}
	}
	public double getYPos()
	{
		return lorrys[0].getYPosition();
	}
	public void SetYPos(double YPos)
	{
		for(int i=noRectangles-1;i>-1;i--)
		{
			lorrys[i].setYPosition(lorrys[i].getYPosition() - lorrys[0].getYPosition() + YPos);
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
				lorrys[i].setXPosition(lorrys[i].getXPosition() + velocity);
			else
				lorrys[i].setXPosition(lorrys[i].getXPosition() - velocity);
		}
		if(lorrys[0].getXPosition()<-100)
		{
			for(int i=0;i<noRectangles;i++)
			{
			lorrys[i].setXPosition(lorrys[i].getXPosition() + 1000);
			changeColour();
			}
		}
		if(lorrys[0].getXPosition()>900)
		{
			for(int i=0;i<noRectangles;i++)
			{
				lorrys[i].setXPosition(lorrys[i].getXPosition() - 1000);
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