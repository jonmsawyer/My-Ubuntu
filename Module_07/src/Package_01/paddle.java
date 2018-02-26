package Package_01;

public class paddle extends main_07
{
	int paddleLength;
	int paddlePosition;
	
	public paddle()
	{
		paddleLength = this.paddleNewLength();
		paddlePosition = this.paddleNewPosition();
	}
	
	private int paddleNewLength()
	{
		length_01 length_02 = new length_01();
		int randomLength = length_02.lengthLength;

		return randomLength;
	}
	
	private int paddleNewPosition()
	{
		position_01 position_02 = new position_01();
		int randomPosition = position_02.positionPosition;
		
		return randomPosition;
	}
	
	public void paddlePrint(int length, int position)
	{
		for(int i = 0; i < position; i++)
		{
			System.out.print(" ");
		}
		for(int i = 0; i < length; i++)
		{
			System.out.print("X");
		}
		
		System.out.println();
	}
}