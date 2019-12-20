
/**
 * クラス e4 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;
//import java.awt.Rectangle;
public class ex9{
    public static Rectangle createRectangle(int x, int y, int width, int height){
     //method called createrectangle will create a rectangle
     Rectangle box = new Rectangle(x,y,width,height);
     return box;
     
     
    }
    public static Point findCentre(Rectangle blank){
        //Create a method called findCenter to find the centre of the rectangle 
     int a = blank.x + (blank.width/2);
     int b = blank.y + (blank.height/2);
     return new Point(a,b);
     
    }
    public static void main (String[]args){
        //print the centre value in main method
     Rectangle c = createRectangle(10,20,50,60);
     System.out.print(findCentre(c));
     
     
     
    }
    
}
