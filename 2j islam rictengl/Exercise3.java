import java.awt.Rectangle;
public class Exercise3{
    public static Rectangle createRectangle( int x,int y,int width,int height){
        return new Rectangle(x,y,width,height);
         
    }
      public static void PrintRectangle(Rectangle a){
       System.out.print(a);
      }
      public static void main(String[]args){
       printRectangle (createRectangle(20,80,20,15));   
      
      }
}