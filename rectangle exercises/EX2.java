
/**
 * クラス EX2 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class EX2{
    public static void createRectangle(int x,int y,int width,int height){
        Rectangle one = new Rectangle(x,y,width,height);
        printRectangle(one);
        //return new Rectangle();
    }
    public static void main(String[]args){
        createRectangle(50,75,20,15);
    }
    public static void printRectangle(Rectangle a){
        System.out.print(a);
     
    }
}
