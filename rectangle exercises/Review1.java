
/**
 * クラス re1 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (2019/12/20)
 */
import java.awt.Rectangle;
public class Review1{
    //create rectangle object
    public static void main(String[]args){
        //create rectangle
        Rectangle box = new Rectangle(2,5,10,20);
        //print
        System.out.println(box);
        //create box2
        Rectangle box2 = box;
        //print
        System.out.println(box2);
        //box translate
        box.translate(50,100);
        //print
        System.out.println(box);
        //print
        System.out.println(box2);
        
        
    
    }
}