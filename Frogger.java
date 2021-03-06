public class Frogger
{

	public static void main(String[] args)
	{
		int numberofcars = 16;
		int numberoflorrys = 11;
		int level = 1;
		boolean forward = true;
		boolean left1 = true;
		boolean right1 = true;
	    GameArena arena = new GameArena(800,800);
		Car[] cars = new Car[numberofcars];
		Lorry[] lorrys = new Lorry[numberoflorrys];
		cars[0]= new Car(400,100,true,1.2);
		lorrys[0] = new Lorry(700,100,true,1.2);
		cars[1] = new Car(100,100,true,1.2);
		cars[2] = new Car(500,150,false,1);
		cars[3] = new Car(800,150,false,1);
		cars[4] = new Car(100,150,false,1);
		lorrys[1] = new Lorry(300,200,true,0.5);
		cars[5] = new Car(600,200,true,0.5);
		lorrys[2] = new Lorry(0,200,true,0.5);

		lorrys[3]= new Lorry(400,300,false,1);
		cars[6] = new Car(700,300,false,1);
		cars[7] = new Car(100,300,false,1);
		lorrys[4] = new Lorry(500,350,true,1.1);
		cars[8] = new Car(800,350,true,1.1);
		cars[9] = new Car(100,350,true,1.1);
		lorrys[5] = new Lorry(300,400,false,0.7);
		cars[10] = new Car(600,400,false,0.7);
		lorrys[6] = new Lorry(0,400,false,0.7);	

		lorrys[7]= new Lorry(450,500,false,0.9);
		cars[11] = new Car(750,500,false,0.9);
		cars[12] = new Car(150,500,false,0.9);
		lorrys[8] = new Lorry(550,550,true,1);
		cars[13] = new Car(850,550,true,1);
		cars[14] = new Car(150,550,true,1);
		lorrys[9] = new Lorry(250,600,false,0.6);
		cars[15] = new Car(550,600,false,0.6);
		lorrys[10] = new Lorry(-50,600,false,0.6);	
		Frog f = new Frog();
		arena.addFrog(f);
		for(int i=0;i<numberofcars;i++)
		{
			arena.addCar(cars[i]);
		}
		for(int i=0;i<numberoflorrys;i++)
		{
			arena.addLorry(lorrys[i]);
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
			for(int i=0;i<numberoflorrys;i++)
			{
				lorrys[i].move();
				if(lorrys[i].getXPos()-f.getXPosition()<69 && lorrys[i].getXPos()-f.getXPosition()>-69 && lorrys[i].getYPos()-f.getYPosition()<40 && lorrys[i].getYPos()-f.getYPosition()>-30)
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
				right1 = false;
			}
			else
				right1 = true;
			if(f.getYPosition()<30)
			{
				level++;
				System.out.println("\nLevel complete\nStarting level " + level + ".");
				for(int i=0;i<numberofcars;i++)
					cars[i].setVel(1.5*cars[i].getVel());
				for(int i=0;i<numberoflorrys;i++)
					lorrys[i].setVel(1.5*lorrys[i].getVel());
				f.setXPosition(400);
				f.setYPosition(750);
			}
		}
	}
}