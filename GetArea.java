import java.util.ArrayList;

public class shapeTest {
    public static double getArea(Circle[] clist){
    double sum = 0; 
        for (int i = 0; i < clist.length; i++) {
            sum += clist[i].getArea();
        }
        return sum;
    }
    public static double getArea(ArrayList<Rectangle> clist){
        double sum = 0;
        for (Rectangle r : clist) {
            sum += r.getArea();
        }
        return sum;
    }
    public static double getArea(Triangle[][] clist){
        double sum = 0;
        for (Triangle[] r : clist) {
            for (Triangle[] t : r) {
                sum += t.getArea();
            }
        }
        return sum;
    }
    public static void main(String[] args){
        // Circle[] clist = new Circle[3];
        // Circle c1 = new Circle("red", 3);
        // Circle c2 = new Circle("red", 4);
        // clist[0] = c1;
        // clist[1] = c2;
        
    }
}
