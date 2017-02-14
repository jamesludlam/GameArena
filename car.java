public java car
{
	private double xposition = 400;
	private double yposition = 400;
	private boolean right = true;
	private double velocity = 0.01;
	Rectangle car = new Rectangle(xposition,yposition,30,10,"BLUE")
	public double GetXPos(void)
	{
		return xposition;
	}
	public double GetYPos(void)
	{
		return yposition;
	}
	public double GetVel(void)
	{
		return velocity;
	}
	public void SetVel(double Vel)
	{
		velocity = Vel;
	}
	public void move(void)
	{
		if(right)
			xposition += velocity;
		else
			xposition -= velocity;
	}
}