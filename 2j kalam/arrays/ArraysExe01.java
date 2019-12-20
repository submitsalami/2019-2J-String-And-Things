public class ArraysExe01{
 public static double powArray(double[] target){
     
      for (int i=0;i<target.length;i++){
        target[i] = Math.pow(target[i],2.0);
        System.out.println(target[i]);
       
      }
      return 1;
   }
   public static void main(){
       double a[]={2,3,4,5};
       powArray(a);
   
}
}

