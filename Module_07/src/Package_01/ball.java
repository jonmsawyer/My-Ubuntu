package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class ball extends main_07
{

	int ballLength;
	int ballPosition;
	
	public ball()
	{
		ballLength = this.ballNewLength();
		ballPosition = this.ballNewPosition();		
	}
	
	private int ballNewLength()
	{
		int randomLength = 1;
		
		return randomLength;
	}
	
	private int ballNewPosition()
	{
		int randomPosition = ThreadLocalRandom.current().nextInt(5, 51);
		
		return randomPosition;
	}
	
	public void ballPrint(int length, int position)
	{
		for(int i = 0; i < position; i++)
		{
			System.out.print(" ");
		}
		for(int i = 0; i < length; i++)
		{
			System.out.print("O");
		}
		
		System.out.println();
	}
}