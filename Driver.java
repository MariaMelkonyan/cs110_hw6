import Shapes.Square;
import Shapes.Rectangle;

public class Driver {

    public static void main (String[] args) {
        Square Sq = new Square();
        Sq.setLength(100);
        int SqArea = Sq.getArea();

        Rectangle Rec = new Rectangle();
        Rec.setLenghtHeight(50, 80);
        int RecArea = Rec.getArea();

        System.out.println(SqArea);
        System.out.println(RecArea);
        
        double N = 15.6;
	    System.out.println(Math.factorialR((int)N));
		System.out.println(Math.factorialLoop((int)N));
        }
    }
}
