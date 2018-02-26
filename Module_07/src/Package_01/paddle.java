package Package_01;

public class paddle extends PaddleBall
{
	int newLength()
	{
		length_01 length_02 = new length_01();
		int randomLength = length_02.lengthLength;

		return randomLength;
	}
	
	int newPosition()
	{
		position_01 position_02 = new position_01();
		int randomPosition = position_02.positionPosition;
		
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
			System.out.print("X");
		}
		
		System.out.println();
	}
}