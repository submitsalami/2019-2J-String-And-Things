public class ArraysExe4{
   public static void main(){
    int[]ABC={2,4,6,8,10};
    System.out.println(indexOfMax(ABC));
   
  }
public static int indexOfMax(int[]ABC){
    int min = ABC[0];
    int max = 0;
    for(int i=0;i<ABC.length;i++){
        if(min>ABC[i]){
           min=ABC[i];
        }
         if(max<ABC[i]){
           max=ABC[i];
         
        }

}
  return max;
   }
}
