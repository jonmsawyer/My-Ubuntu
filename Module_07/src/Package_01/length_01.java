package Package_01;

import java.util.concurrent.ThreadLocalRandom;

public class length_01 extends paddle
{
	int lengthLength;

	public length_01() {
		lengthLength = this.newLength();
	}
	
	private int newLength()
	{
		int randomLength = ThreadLocalRandom.current().nextInt(3, 11);
		
		return randomLength;
	}
}
