import java.util.Random;
import java.util. Arrays;
public class ArraysExe1b{
    public static void main(String[]args){
       
        int[] scores = histogram(100);
       
   
       
        int[] count =new int[100];
        for(int i =0;i<count.length;i++){
            count[i]=inRange(scores,i,i+1);
            System.out.println("count["+i+"] ="+count[i]);
       
        }
       
        System.out.println(Arrays.toString(count));
       
 
     }
   
     public static int[] histogram(int size){
         Random random = new Random();
         int []a =new int [size];
           for (int i=0;i<a.length;i++){
             a[i]=random.nextInt(size);
           }
        return a;
      }
    public static int inRange (int[]a,int low  ,int high){
        int count =0;
        for(int i=0;i<a.length;i++){
            if (a[i]>=low && a[i]<high){
                count++;
            }
           
        }
        return count;
        }
       
}