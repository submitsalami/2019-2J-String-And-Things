import java.awt.*;


public class shiftBox
{
    public static void main(){
         Rectangle box = findCen.create(7,30,23,5);
         findCen.print(box);
         
         shift(box,3,5);
         findCen.print(box);
         
    }
    public static void shift(Rectangle one, int a, int b){
         one.x = one.x + a;
         one.y = one.y + b;
         
         
    }
}
