
/**
 * Write a description of class pythogrs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class pythogrs{
    //create a method called create point with two para xy
    public static void createPoint(Point p1,Point p2,Point p3){
        //find a
        int a = p2.x-p1.x;
        //find b
        int b = p3.y-p2.y;
        //distance calculation
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //print
        System.out.print(c);
    }
    public static void main(String[]args){
        //create the points
        Point p1 = new Point(3,2);
        Point p2 = new Point(7,2);
        Point p3 = new Point(7,5);
        //call the create point method
        createPoint(p1,p2,p3);
    }
    
    
}
    