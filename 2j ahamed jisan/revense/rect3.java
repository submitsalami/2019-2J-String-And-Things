import java.awt.*;
public class rect3
{
    public static Rectangle createRectangle(int x,int y,int width,int height){
        return new Rectangle(x,y,width,height);
       // printRectangle(blank);
    }
    /*public static void printRectangle(Rectangle a){
        System.out.print(a);
    }
    */
    public static void main(String[]args){
    System.out.print(createRectangle(58,75,28,15));
    }
}