import java.awt.Rectangle;
public class Exercise100{
    public static void createRectangle( int x,int y,int width,int height){
        Rectangle one = new Rectangle(x,y,width,height);
        PrintRectangle(one);
    
    }
     public static void main(String[]args){
        createRectangle(50,75,20,15);
     }
      public static void PrintRectangle(Rectangle a){
       System.out.print(a);
      }
  
}