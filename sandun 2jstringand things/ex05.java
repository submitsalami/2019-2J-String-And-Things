package mongal;
import java.util.Arrays;
public class ex05{
 public static void shoping(String[]args){
     
     double[]grades={98.2,22.9,30.0};
     double[]scores=Arrays.copyOf(grades,2);
     for(int i=0;i<=1;i++){
         scores[i]=grades[i];
         System.out.print(scores[i]+" ");
        
        }
     
    
    }
}