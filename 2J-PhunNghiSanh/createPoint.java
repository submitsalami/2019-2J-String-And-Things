import java.awt.*;

public class createPoint
{
    public static double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
    
 }
    public static void main(){
        Point p1 = create(3,2);
        Point p2 = create(7,2);
        Point p3 = create(7,5);
        System.out.println(sumPoint(p1));
        
        System.out.println(distance(p1,p2));
 }
    public static int sumPoint(Point p1){
        int total = p1.x * p1.x + p1.y * p1.y;
        return total;
 }
    public static Point create(int x, int y){
        return new Point(x,y);
        
 }
}
