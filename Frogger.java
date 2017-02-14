public class Frogger
{
	public static void main(String[] args){
		GameArena arena = new GameArena(600,600);
		Frog f = new Frog();

		 arena.Frog.addBall(f);
		 
		 while(true)
		 {
			 double x = f.getXPosition();
			 if (x < 500)
				 f.setXPosition(x+1);
			 else
				 f.setXPosition(0);
			 
			 }	 
	 }
}