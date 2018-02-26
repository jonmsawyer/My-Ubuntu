package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class ball extends PaddleBall
{
	int newLength()
	{
		return 1;
	}
	
	int newPosition()
	{
		return ThreadLocalRandom.current().nextInt(5, 51);
	}
	
	public void print()
	{
		for(int i = 0; i < this.getPosition(); i++)
		{
			System.out.print(" ");
		}
		
		for(int i = 0; i < this.getLength(); i++)
		{
			System.out.print("O");
		}
		
		System.out.println();
	}
}