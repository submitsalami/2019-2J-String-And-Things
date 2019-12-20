import java.awt.*;
public class rect2
{
    public static void createRectangle(int x,int y,int width,int height){
        Rectangle blank = new Rectangle(x,y,width,height);
        printRectangle(blank);
    }
    public static void printRectangle(Rectangle a){
        System.out.print(a);
    }
    public static void main(String[]args){
        createRectangle(58,75,28,15);
    }
}