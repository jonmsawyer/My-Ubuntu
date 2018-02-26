package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class position_01
{
	int positionPosition;

	public position_01() {
		positionPosition = this.newPosition();
	}
	
	private int newPosition()
	{
		int randomPosition = ThreadLocalRandom.current().nextInt(5, 51);
		
		return randomPosition;
	}
}
