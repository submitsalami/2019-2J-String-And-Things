//create an array of 20 random values between 0&20 create a mathod called rangeCount. This method counts & returns all the values in your arrays between 0&5

import java.util.Random;
public class Exercise1{
    public static int[]randomArray(int size){
        Random random = new Random();
        int[]a = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = random.nextInt(20);
        }
        return a;
    }
    public static int inRange(int[]a,int low,int high){
        int count = 0;
        for(int i=0; i<a. length; i++){
            if (a [i]>=low && a[i]<high){
                count++;
            }
    }
    return count;
   }
    public static void main(String []args){
        int[]score= randomArray(20);
        int a = inRange(score,0,5);
        System.out.print(a);
        
    }
}        