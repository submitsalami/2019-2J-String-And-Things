
/**
 * クラス e5の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;
//import java.awt.Rectangle;
public class ex10{
    //create a method called shiftBox to shift a existing box
    public static Rectangle shiftBox(int x, int y, int width, int height){
     Rectangle box = new Rectangle(x,y,width,height);
     
     return box;
    
     
     
    }
    //with a next method to make a new box i named my method findNew to add 
    //value to my new box attributes 
   public static void findNew(Rectangle blank,int a,int b){
     blank.x = blank.x + a;
     blank.y = blank.y + b;
     //return new Point(a,b);
     
    }
    
    public static void main (String[]args){
    //in the main method i will call my findNew method to print new box
     Rectangle box2 = shiftBox(7,30,23,5);
      findNew(box2,3,5);
     System.out.print(box2);
     
     
     
    }
    
}
