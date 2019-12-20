
/**
 * クラス ex3 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class ex3{
   public static void main(String[]args){
      //a point has two attributes x and y
      printPoint(new Point(10, 5));
      
    }
   
    public static void printPoint(Point p){  
      
      System.out.println(p.x);
      System.out.println(p.y);
    }
}
