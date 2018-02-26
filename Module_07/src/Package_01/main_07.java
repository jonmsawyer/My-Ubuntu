package Package_01;

import java.util.concurrent.TimeUnit;

public class main_07
{
	public static void main(String args[]) throws InterruptedException
	{		
		for(int i = 0; i < 1; i++)
		{
			System.out.println("============================================================");
			paddle paddle_01 = new paddle();
			ball ball_01 = new ball();
			
			paddle_01.print();
			ball_01.print();
			
			if(ball_01.position >= paddle_01.position)
			{
				if(ball_01.position + 1 <= paddle_01.position + paddle_01.length)
				{
					System.out.println("Ka-Ping!");
				}
			}
			TimeUnit.MILLISECONDS.sleep(250);
			System.out.println("============================================================");
		}
	}
}
