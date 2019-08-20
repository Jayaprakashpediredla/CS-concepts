class Point
{
	private int x,y;
	void setx(int x)
	{
		
		x=(x>79?79:(x<0?0:x));
		System.out.println(this.x);
		System.out.println(x);
	}
	void sety(int y)
	{
		y=(y>24?24:(y<0?0:y));
	}
	int getx()
	{
		return x;
	}
	int gety()
	{
		return y;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		p.setx(22);
		p.sety(44);
		System.out.println(p.getx()+" "+p.gety());
		
	}

}
