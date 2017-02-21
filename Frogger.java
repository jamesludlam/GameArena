public class Frogger
{

	public static void main(String[] args)
	{
	    GameArena arena = new GameArena(800,800);
		Car c1 = new Car(400,50);
		Frog f = new Frog();
		arena.addBall(f.f);
		arena.addCar(c1);
		
		 while(true)
		 {
			c1.move();
			arena.pause();
			
			 if(arena.upPressed())
		     {
			   f.move();
		     }
		 }
	}
}