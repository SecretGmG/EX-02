package shapes;
import myIO.Prompt;
public class Rectangle {
	
	double lengthX;
	double lengthY;
	
	public Rectangle(double lengthX, double lengthY) {
		this.lengthX = lengthX;
		this.lengthY = lengthY;
	}
	
	public static void main(String[] args) {
		double x = Prompt.PromptDouble("Enter the width of a rectangle");
		double y = Prompt.PromptDouble("Enter the height of arectangle");
		
		Rectangle rect = new Rectangle(x,y);
		
		System.out.println(
				String.format("This rectganles area is %.4f", rect.ComputeArea())
				);
		System.out.println(
				String.format("This rectangles perimeter is %.4f", rect.ComputePerimeter())
				);
		if(rect.IsSquare()) {
			System.out.println("The rectangle you defined is actually a square!");
		}
		else {
			System.out.println("Your rectangle is not a Square!");
		}		
	}
	
	public boolean IsSquare() {
		return lengthX == lengthY;
	}
	public double ComputeArea() {
		return lengthX*lengthY;
	}
	public double ComputePerimeter(){
		return 2*lengthX + 2*lengthY;
	}

}
