package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class paddle extends PaddleBall
{
	int newLength()
	{
		return ThreadLocalRandom.current().nextInt(3, 11);
	}
	
	int newPosition()
	{
		return ThreadLocalRandom.current().nextInt(5, 51);
	}
	
	public void print()
	{
		for(int i = 0; i < this.position; i++)
		{
			System.out.print(" ");
		}
		
		for(int i = 0; i < this.length; i++)
		{
			System.out.print("X");
		}
		
		System.out.println();
	}
}