import java.awt.*;
 public class ex1{
    public static void main(String[]arg){
      
        Rectangle box=new Rectangle(2,5,10,20);
        
        System.out.println(box);
        
        Rectangle box2=box;
        
        System.out.println(box2);
        
        box.translate(50,100);
        
        System.out.println(box);
        
        System.out.println(box2);
    }
}