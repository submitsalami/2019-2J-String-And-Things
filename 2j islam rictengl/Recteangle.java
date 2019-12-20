
import java.util.Scanner;

public class Recteangle {
    public static void main(String[]args){
       Scanner scanner = new Scanner (System.in);
         int widthX = 5;
         int heightY = 10;
         
        System.out.print("Enter the width of rectangle:");
        widthX = scanner.nextInt();
        widthX = widthX+heightY;
        System.out.print("Enter the height of rectangle:");
        heightY = scanner.nextInt();
        heightY = heightY/5;
        System.out.println("The width of Rectangle is : " + widthX );
        System.out.println("The height of Rectangle is : " + heightY );
    }


}