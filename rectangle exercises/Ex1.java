
/**
 * クラス Ex1 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (2019/12/13)
 */
import java.awt.Rectangle;
public class Ex1{
   public static void createRectangle(int x,int y,int width,int height){
        Rectangle one = new Rectangle(x,y,width,height);
        printRectangle(one);
        }
    public static void main(String[]args){
        createRectangle(5,10,15,2);
    }
    public static void printRectangle(Rectangle a){
        System.out.print(a);
     
    }
}
        
        
    
    

