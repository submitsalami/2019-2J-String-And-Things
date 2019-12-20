import java.awt.*;
public class ex1
{
    public static void main(String[]arg){
        //create rectangle
        Rectangle box=new Rectangle(2,5,10,20);
        //print box
        System.out.println(box);
        //box rectangle
        Rectangle box2=box;
        //print box
        System.out.println(box2);
        //use translat
        box.translate(50,100);
        //print box after translate 
        System.out.println(box);
        //print box2 after translate
        System.out.println(box2);
    }
}