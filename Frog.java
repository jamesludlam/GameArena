public class Frog
{
    private double xPosition;			
	private double yPosition;		
	private double size;				
	private String colour;	            
	Ball f = new Ball(100,100,20,"GREEN");		
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
    public Frog (double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;
		size = diameter;
		colour = col;
	}
	
}
