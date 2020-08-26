public class Circle extends Shape implements Calculatable {
    private int radius;
    
    public Circle(){
    	super("Circle");
    	this.radius = 50;
    }
    
    public Circle(int radius){
    	super("Circle");
    	this.radius = radius;
    	
    }
    
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
