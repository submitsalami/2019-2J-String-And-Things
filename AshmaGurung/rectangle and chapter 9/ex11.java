
/**
 * クラス ex11 の注釈をここに書きます.
 * rectangle
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class ex11{
    public static void main (String[]args){
        //simply create a rectangle object called box
        //a rectangle has attributes x, y, width and height
       Rectangle box = new Rectangle(2, 5, 10, 20);
       //print box
       System.out.println(box);
       //now create another rectangle name box2 
       Rectangle box2 = box;
       //box2 and box with same attributes
       box.translate(50,100);
       //now .translate will add the x and y attributed by 50 and 100
       //now print it
       System.out.println(box);
       System.out.println(box2);
       
    }
}
