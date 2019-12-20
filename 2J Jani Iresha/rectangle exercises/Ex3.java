
/**
 * クラス Ex3 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (2019/12/13)
 */
import java.awt.*;
public class Ex3{
    //create rectangle method
    public static Rectangle createRectangle(int x,int y,int width,int height){
        //give attribute for rectangle
        return new Rectangle(x,y,width,height);
        
        
    }
    //make a method
    public static void printRectangle(Rectangle a){
        System.out.print(a);
    }
    public static void main(String[]args){
        //call method
        
        printRectangle(createRectangle(20,80,20,15));
        
    }
        
    
   } 

