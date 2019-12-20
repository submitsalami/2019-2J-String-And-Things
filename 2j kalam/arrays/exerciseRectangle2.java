import java.awt.Rectangle;
public class exerciseRectangle2{
   public static void createRectangle(int x, int y, int width, int height){
        Rectangle one = new Rectangle(x, y, width, height);       
        printRectangle(one);
   }   
   public static void main (String[]args){     
      createRectangle(50, 75, 20, 15);    
    }   
    public static void printRectangle(Rectangle a){      
       System.out.print(a);
    }
}


