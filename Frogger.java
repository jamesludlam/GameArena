public class Frogger
{
	public static void main(String[] args){
	GameArena arena = new GameArena(800,800);
		car c1 = new car();
		Frog f = new Frog();
		arena.addBall(f.f);
		arena.addCar(c1);
		 while(true)
		 {
			c1.move();
			arena.pause();
		 }
	}
}