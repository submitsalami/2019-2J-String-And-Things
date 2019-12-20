
/**
 * クラス Ex4 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (2019/12/13)
 */
import java.awt.*;
public class Ex4{
    //create rectangle method
    public static Rectangle createRectangle(int x,int y,int width,int height){
        //give attribute for reactangle
        Rectangle sss = new Rectangle (x,y,width,height);
        //call print method
        return sss;
    }
    public static Point findCenter(Rectangle box1,int a,int b){
        a =box1.x + (box1.width/2);
        b =box1.y + (box1.height/2);
        return new Point(a,b);
    }
    public static void main(String[]args){
    Rectangle box2 = createRectangle(10,20,50,40);
    System.out.print(findCenter(box2,box2.x,box2.y));
    }
}
