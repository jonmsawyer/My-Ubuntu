package Package_01;

abstract class PaddleBall
{
	private int length;
	private int position;
	
	public PaddleBall()
	{
		this.newLength();
		this.newPosition();
	}
	
	int getLength()
	{
        return this.length;
	}
	
	int getPosition()
	{
        return this.position;
	}
	
	void setLength(int l)
	{
        this.length = l;
	}
	
	void setPosition(int p)
	{
	    this.position = p;
	}
	
	abstract void newLength();
	abstract void newPosition();
	abstract public void print();
}