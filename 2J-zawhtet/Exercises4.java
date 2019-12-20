public class Exercises4{
    public static void main(String[] arg){
        int[] b ={1,2,3,4,5};
        System.out.println(indexOfmax(b));
    }
    public static int indexOfmax(int[]a){
        int i = 0;
        int index = 0;
        for(int x : a){
            if(a[i] > a[index]){
            index = i;
          }
           i++;
          }
         return index; 
    }
}
