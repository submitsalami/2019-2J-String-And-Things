
/**
 * クラス ex3 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class ex4{
   public static void createPoint(int x, int y){
        Point p = new Point(x, y);
        //a point has two attributes x and y
        p.x = 5;
        p.y = 5;
        printPoint(p);
   }
    
   public static void main (String[]args){
      
      createPoint(4, 4);
      //Point p = new Point();
      
      
    }
    //create a method called createPoint, it takes two variable x and y.
    //In createPoint create point : (x ,y)
    
    public static void printPoint(Point a){
        
       System.out.print(a); 
    }
}

