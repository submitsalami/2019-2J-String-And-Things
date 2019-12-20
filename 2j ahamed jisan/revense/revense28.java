public class revense28{
    public static void main(String[]args){
        int[]n={11,32,40,6,38,83};
        int temp;
        for(int i= 0;i < n.length;i++){
         for(int j = i + i;j < n.length;j++){
             if(n[i] < n[j]){
                 temp = n[i];
                 n[i] = n[j];
                 n[j] = temp;
                }
            }
            System.out.print(n[i]+" ");
        }
    }
}