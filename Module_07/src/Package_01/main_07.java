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
			
			paddle_01.paddlePrint(paddle_01.paddleLength, paddle_01.paddlePosition);
			ball_01.ballPrint(ball_01.ballLength, ball_01.ballPosition);
			
			if(ball_01.ballPosition >= paddle_01.paddlePosition)
			{
				if(ball_01.ballPosition + 1 <= paddle_01.paddlePosition + paddle_01.paddleLength)
				{
					System.out.println("Ka-Ping!");
				}
			}
			TimeUnit.MILLISECONDS.sleep(250);
			System.out.println("============================================================");
		}
	}
}
