package pkgShape;

public class Rectangle {

	private int Length;
	private int Width;
	public Rectangle (int Width, int Length)
	{
		this.Length = Length;
		this.Width= Width;
	}
	

	public double Area() {
		return (double)Length*Width;

	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public double Perameter() {
		return (double)(2*Length)+(2*Width);
	}
	public boolean IsSquare() {
		
	}
public boolean AreSidesEqual()
return IsSquare();
}
