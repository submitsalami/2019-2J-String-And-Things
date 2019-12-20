
/**
 * クラス ex1 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class ex1{
   public static void main(String[]args){
       //a point has two attributes x and y
      Point blank = new Point(10, 5);
      System.out.println(blank); //print the point called blank
      System.out.println(blank.x); //print the x attribute
      System.out.println(blank.y); //print the y attribute
      
      blank.x = 13;
      blank.y = 23;
      System.out.println(blank);
    }
}
