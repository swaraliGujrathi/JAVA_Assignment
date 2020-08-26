public class Rectangle extends Shape implements Calculatable {
	
	private int x;
	private int y;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super("Rectangle");
		this.x=20;
		this.y=20;
	}
	
	public Rectangle(int x,int y){
		super("Rectangle");
		this.x = x;
		this.y=y;
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (x*y);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2*(x+y));
	}

}
