public class minmax26{
    public static void main(String[]args){
        int[]n = {4,10,8,2,1,6,3,5,7,9};
        int min = n[0];
        int max = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<min){
                min = n [i];
        }
    }
    for(int j =0;j<n.length;j++){
        if(n[j]>max){
            max= n[j];
       }
     }
  }
} 
