public class Frogger
{

	public static void main(String[] args)
	{
		int numberofcars = 18;
		int level = 1;
		boolean forward = true;
		boolean left1 = true;
		boolean right1 = true;
	    GameArena arena = new GameArena(800,800);
		Car[] cars = new Car[numberofcars];
		cars[0]= new Car(400,50,true,1.2);
		cars[1] = new Car(700,50,true,1.2);
		cars[2] = new Car(100,50,true,1.2);
		cars[3] = new Car(500,100,false,1);
		cars[4] = new Car(800,100,false,1);
		cars[5] = new Car(100,100,false,1);
		cars[6] = new Car(300,150,true,0.5);
		cars[7] = new Car(600,150,true,0.5);
		cars[8] = new Car(0,150,true,0.5);

		cars[9]= new Car(400,250,false,1);
		cars[10] = new Car(700,250,false,1);
		cars[11] = new Car(100,250,false,1);
		cars[12] = new Car(500,300,true,1.1);
		cars[13] = new Car(800,300,true,1.1);
		cars[14] = new Car(100,300,true,1.1);
		cars[15] = new Car(300,350,false,0.7);
		cars[16] = new Car(600,350,false,0.7);
		cars[17] = new Car(0,350,false,0.7);		
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
				if(cars[i].getXPos()-f.getXPosition()<48 && cars[i].getXPos()-f.getXPosition()>-48 && cars[i].getYPos()-f.getYPosition()<40 && cars[i].getYPos()-f.getYPosition()>-30)
				{
				for(int j=0;j<100;j++)
					arena.pause();
				System.out.println("\nGame Over!\nYou made it to level " + level + ".");
				arena.exit();
				}
			}
			arena.pause();
			
			if(arena.upPressed())
		    {
				if(forward)
					f.up();
				forward = false;
		    }
			else
				forward = true;
			if(arena.leftPressed() && f.getXPosition()>50)
			{
				if(left1)
					f.left();
				left1 = false;;
			}
			else
				left1 = true;
			if(arena.rightPressed() && f.getXPosition()<750)
			{
				if(right1)
					f.right();
				right1 = false;;
			}
			else
				right1 = true;
			if(f.getYPosition()<30)
			{
				level++;
				System.out.println("\nLevel complete\nStarting level " + level + ".");
				for(int i=0;i<numberofcars;i++)
				{
					cars[i].setVel(1.5*cars[i].getVel());
				}
				f.setXPosition(400);
				f.setYPosition(750);
			}
		}
	}
}