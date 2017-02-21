public class Frog
{
    private double xPosition = 400;			
	private double yPosition = 750;		
	private double size;				
	private String colour;	            
	Ball f = new Ball(xPosition,yPosition,20,"GREEN");		
	public double getXPosition()
	{
		return xPosition;
	}

	
	public double getYPosition()
	{
		return yPosition;
	}

	
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	
	public double getSize()
	{
		return size;
	}

	
	public String getColour()
	{
		return colour;
	}
	
	public void up()
	{
    f.setYPosition(getYPosition() - 5);
	yPosition = yPosition-5; 
	}
	public void left()
	{
	f.setXPosition(getXPosition() - 5);
	xPosition = xPosition-5; 
	}
	public void right()
	{
	f.setXPosition(getXPosition() + 5);
	xPosition = xPosition+5; 
	}
}