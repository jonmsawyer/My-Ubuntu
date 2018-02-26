package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class ball extends PaddleBall
{
	int newLength()
	{
		int randomLength = 1;
		
		return randomLength;
	}
	
	int newPosition()
	{
		int randomPosition = ThreadLocalRandom.current().nextInt(5, 51);
		
		return randomPosition;
	}
	
	public void print()
	{
		for(int i = 0; i < this.position; i++)
		{
			System.out.print(" ");
		}
		for(int i = 0; i < this.length; i++)
		{
			System.out.print("O");
		}
		
		System.out.println();
	}
}