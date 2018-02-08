/*
 * name: Clock_01.java
 * author: Kai Sawler
 * date: 08-FEB-2018
 * description:
 * 		Write the java code for your clock, per your activity diagram.
 * 		Get the code to run, without waiting 1 second, so the clock runs
 * 		very fast for verification. Added comment for real-time clock.
 */

package Package_01; // basic package declaration, for later improvement

import java.util.concurrent.TimeUnit; //import not used, check line 37 for details

@SuppressWarnings("unused") // check line 13 for details
public class Clock_01
{
	public static void main(String[] args) throws InterruptedException // exception made for line 13
	{
		int seconds = 0; // integer for counting seconds
		int minutes = 0; // integer for counting minutes
		int hours = 0; // integer for counting hours

		while (true) // this clock will never end, it will get to 11:59:59 and then reset to 00:00:00
		{
			for (hours = 0; hours < 12; hours++) // count up to 12 hours, allowing for nested loops
			{
				for (minutes = 0; minutes < 60; minutes++) // nested loop
				{
					for (seconds = 0; seconds < 60; seconds++) // nested loop
					{
						if (seconds > 60) // error checker
						{
							System.out.println("ERROR: Over-Clocked! Line 34");
							break;
						}
						// TimeUnit.SECONDS.sleep(1); // Uncomment this for real-time clock
						System.out.println("The time is currently: " + hours + ":" + minutes + ":" + seconds);
					}
					if (minutes > 60) // error checker
					{
						System.out.println("ERROR: Over-Clocked! Line 42");
						break;
					}
				}
				if (hours > 12) // error checker
				{
					System.out.println("ERROR: Over-Clocked! Line 48");
					break;
				}
			}
		}
	}
}