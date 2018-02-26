package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class ball extends PaddleBall
{
	void newLength()
	{
		this.setLength(1);
	}
	
	void newPosition()
	{
		this.setPosition(ThreadLocalRandom.current().nextInt(5, 51));
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