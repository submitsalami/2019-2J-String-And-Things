
/**
 * クラス ex3 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class ex8{
   public static Rectangle createRectangle(int x, int y, int width, int height){
      // create a method called create rectangle
       Rectangle one = new Rectangle(x, y, width, height); 
       return one;
       // return the rectangle object called one
       //to print it in the print rectangle method
      
    }
    
   public static void main (String[]args){
     //the given attributes to the rectangle
      Rectangle b = createRectangle(20, 80, 20, 15);
      printRectangle(b);
      
      
    }
    
    public static void printRectangle(Rectangle a){
      System.out.print(a);
       //rectangle is print 
    }
}

