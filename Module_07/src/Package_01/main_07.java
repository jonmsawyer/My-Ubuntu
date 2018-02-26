package Package_01;

import java.util.concurrent.TimeUnit;

public class main_07
{
	public static void main(String args[]) throws InterruptedException
	{		
        paddle paddle_01 = new paddle();
        ball ball_01 = new ball();
        
        System.out.println("============================================================");
        
		for(int i = 0; i < 100; i++)
		{
						
			paddle_01.print();
			ball_01.print();
			
			if(ball_01.getPosition() >= paddle_01.getPosition())
			{
				if(ball_01.getPosition() + 1 <= paddle_01.getPosition() + paddle_01.getLength())
				{
					System.out.println("Ka-Ping!");
				}
			}
			
			TimeUnit.MILLISECONDS.sleep(250);
			
			System.out.println("\n============================================================");
			
			paddle_01.newLength();
			paddle_01.newPosition();
			ball_01.newPosition();
		}
	}
}
