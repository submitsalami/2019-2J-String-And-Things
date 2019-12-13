import java.awt.*;

public class findCen
{
    public static void main(){
        
        Rectangle created = create(20,40,50,70);
        print(created);
        
        System.out.println(findCenter(created));
    }
    public static void print(Rectangle a){
        System.out.println(a);
        
    }
    public static Rectangle create(int x, int y, int width, int height){
        Rectangle one = new Rectangle(x ,y ,width, height);
        return one;
    }
    public static Point findCenter(Rectangle a){
        int x = a.x + (a.width / 2);
        int y = a.y + (a.height / 2);
        return new Point(x,y);
    }
}
