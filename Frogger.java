public class Frogger
{

	public static void main(String[] args)
	{
		int numberofcars = 9;
		int level = 1;
	    GameArena arena = new GameArena(800,800);
		Car[] cars = new Car[numberofcars];
		cars[0]= new Car(400,50,true,1.2);
		cars[1] = new Car(700,50,true,1.2);
		cars[3] = new Car(100,50,true,1.2);
		cars[4] = new Car(500,100,false,1);
		cars[5] = new Car(800,100,false,1);
		cars[6] = new Car(100,100,false,1);
		cars[7] = new Car(300,150,true,0.5);
		cars[8] = new Car(600,150,true,0.5);
		cars[2] = new Car(0,150,true,0.5);
		Frog f = new Frog();
		arena.addFrog(f);
		for(int i=0;i<numberofcars;i++)
		{
			arena.addCar(cars[i]);
		}
		System.out.println("Starting level 1");
		while(true)
		{
			for(int i=0;i<numberofcars;i++)
			{
				cars[i].move();
				if(cars[i].getXPos()-f.getXPosition()<30 && cars[i].getXPos()-f.getXPosition()>-30 && cars[i].getYPos()-f.getYPosition()<30 && cars[i].getYPos()-f.getYPosition()>-30)
				{
				System.out.println("\nGame Over!\nYou made it to level " + level + ".");
				arena.exit();
				}
			}
			arena.pause();
			
			if(arena.upPressed())
		    {
				f.up();
		    }
			if(arena.leftPressed())
			{
				f.left();
			}
			if(arena.rightPressed())
			{
				f.right();
			}
			if(f.getXPosition()<30)
			{
				level++;
				System.out.println("\nLevel complete\nStarting level " + level + ".");
				for(int i=0;i<numberofcars;i++)
				{
					cars[i].setVel(1.2*cars[i].getVel());
				}
				f.setXPosition(400);
				f.setYPosition(750);
			}
		}
	}
}