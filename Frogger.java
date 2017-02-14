public class Frogger
{
	public static void main(String[] args){
		GameArena arena = new GameArena(800,800);
		Frog f = new Frog();
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