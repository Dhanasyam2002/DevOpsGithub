
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Circle {

		    private double radius;

		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    // standard getter and setter

		    private double calculateArea() {
		        return radius * radius * Math.PI;
		    }

		    public String toString() {
		        return "The area of the circle [radius = " + radius + "]: " + calculateArea();
		    }
		}

	}

}
