
/**
 * クラス ex2 の注釈をここに書きます.
 * point
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class ex6{
   public static void createRectangle(int x, int y, int width, int height){
        Rectangle one = new Rectangle(x, y, width, height);
        //method called createrectangle will create a rectangle
        printRectangle(one);
   }
    
   public static void main (String[]args){
      
      createRectangle(50, 75, 20, 15);
      //the given attributes to the rectangle
      
      
    }
    
    public static void printRectangle(Rectangle a){
        //rectangle is print
       System.out.print(a); 
    }
}

