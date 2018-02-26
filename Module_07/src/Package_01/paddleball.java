package Package_01;

abstract class PaddleBall
{
	int length;
	int position;
	
	public PaddleBall()
	{
		length = this.newLength();
		position = this.newPosition();
	}
	
	abstract int newLength();
	abstract int newPosition();
	abstract public void print();
}