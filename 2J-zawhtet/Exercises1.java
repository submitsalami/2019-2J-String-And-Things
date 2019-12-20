import java.util.Arrays;
public class Exercises1{
    public static void main(String[] args){
        
        double[]a = {1,2,3};
        powerArray(a,2);
        int[]b = {0,1,2,2,3,3,4,4,4,4,4};
        System.out.println(Arrays.toString(Histogram(b,5))); 
    }
    public static double[] powerArray(double[] a,double value){
        double[] aSquared = new double[a.length];
        for (int i = 0; i < a.length; i++) { 
            aSquared[i] = Math.pow(a[i],value);
            System.out.println(aSquared[i]);
        }
        return aSquared;
    }
    public static int[] Histogram(int[]array,int count){
         int[] score = new int[count];
         for (int i = 0; i < array.length; i++) {
             int index = array[i];
             score[index]++;  
        }
         return score;
     }
}
