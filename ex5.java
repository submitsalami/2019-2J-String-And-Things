/**
 * クラス ex3 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class ex5{
    //create a method createPoint which takes three point objects
   public static void createPoint(Point p1, Point p2, Point p3){
       //calculate the distance using pythagorous law
       //calculate a and b
        int a = p2.x - p1.x;
        int b = p3.y - p2.y;
        // c = a squared plus b squared
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print(c);
   }
    
   public static void main (String[]args){
       //create three point objects
      Point p1 = new Point(3, 2);
      Point p2 = new Point(7, 2);
      Point p3 = new Point(7, 5);
      //call the createpoint in main method
      createPoint(p1, p2, p3);
      
    }
}

