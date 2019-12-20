import java.util.Arrays;
public class chap9x2
{
    public static void main(String[]args){
        String fruit ="Banana";
        System.out.println(Arrays.toString(letterHist(fruit)));
    }
    public static int[]letterHist(String s){
     int[]histResult = new int[26];
     String UpperCaseFruit = s.toUpperCase();
     for(int i = 0; i < s.length() ; i++){
         int character = UpperCaseFruit.charAt(i);
         int result = character - 65;
         histResult[result]++;
        }
        return histResult;
    }
}







