import java.awt.*;
public class rec4{
  //create rectangle method
  public static  Rectangle createRectangle(int x,int y,int width,int height){
    Rectangle blank= new Rectangle(x,y,width,height);
    return blank;
   }
   public static Point findCenter(Rectangle tiger,int a ,int b){
       a = tiger.x +(tiger.width/2);
       b = tiger.y +(tiger.height/2);
       return new Point(a,b);
    }
    public static void main(String[]args){
        Rectangle box =createRectangle(10,20,50,40);
        System.out.print(findCenter(box,box.x,box.y));
    }
}