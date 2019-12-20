import java.awt.*;
public class rec5{
  //create rectangle method
  public static  Rectangle createRectangle(int x,int y,int width,int height){
    Rectangle blank= new Rectangle(x,y,width,height);
    return blank;
   }
   public static void shift(Rectangle blank,int a ,int b){
       blank.x=blank.x+a;
       blank.y=blank.y+b;
       //return new Point(a,b);
    }
    public static void main(String[]args){
        Rectangle box =createRectangle(7,30,23,5);
        shift(box,3,5);
        System.out.println(box);
    }
}