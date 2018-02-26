package Package_01;

abstract class PaddleBall
{
	private int length;
	private int position;
	
	public PaddleBall()
	{
		length = this.newLength();
		position = this.newPosition();
	}
	
	int getLength()
	{
        return this.length;
	}
	
	int getPosition()
	{
        return this.position;
	}
	
	abstract int newLength();
	abstract int newPosition();
	abstract public void print();
}