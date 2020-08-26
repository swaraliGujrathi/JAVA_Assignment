public class TestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculatable impl = new Circle();
        System.out.println("Area of Circle is: \n"+impl.calculateArea());
        
        Calculatable impl1 = new Rectangle();
        System.out.println("\nArea of Rectangle is: \n"+impl1.calculateArea());
        System.out.println("\nPerimeter of Rectangle is: \n"+impl1.perimeter());
        
        Calculatable impl2 = new Square();
        System.out.println("\n Area of Square: \n"+impl2.calculateArea());
        System.out.println("\n Perimeter of Square: \n"+impl2.perimeter());
	}

}
