package mongal;
import java.util.Arrays;
public class ex04{
 public static void shoping(String[]args){
     
     double[]grades={98.2,22.9,30.0};
     double[]scores=Arrays.copyOf(grades,3);
     for(int i=0;i<=2;i++){
         scores[i]=grades[i];
         System.out.print(scores[i]+" ");
        
        }
     
    
    }
}
  