import java.awt.*;
public class RectangleObject{
    public static void main(String[]args){
        //object calleed box 
        Rectangle box = new Rectangle(2, 5, 10, 20);
        System.out.println(box);
        //rectangle object called box2
        Rectangle box2 = box;
        System.out.println(box2);
        //translate method on you box object 
        box.translate  (50,100);
        System.out.println(box);
        System.out.println(box2);
    }
}