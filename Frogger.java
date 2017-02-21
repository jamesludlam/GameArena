public class Frogger
{

	public static void main(String[] args)
	{
	    GameArena arena = new GameArena(800,800);
		Car c1 = new Car(400,50);
		Car c2 = new Car(700,50);
		Car c3 = new Car(100,50);
		Frog f = new Frog();
		arena.addFrog(f);
		arena.addCar(c1);
		arena.addCar(c2);
		arena.addCar(c3);
		
		 while(true)
		 {
			c1.move();
			c2.move();
			c3.move();
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
		 }
	}
}