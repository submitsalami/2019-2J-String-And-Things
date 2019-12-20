
/**
 * クラス ex2b の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)n
 */
import java.util.Arrays;
public class ex2b{
    public static void main(String[]args){
      letterHist("baNaNA");
      
    }
    //create a method letterhist that takes a string with both lower
    //and upper case
    public static int[]letterHist(String fruit){
      char[] characters = fruit.toUpperCase().toCharArray();
      //change the variable in to lower or upper as you wish
      //as we know the total number of english alphabet is 26
      //create an array 
      int[] result = new int[26]; 
      for (int i = 0; i < characters.length; i++) { 
            //loop to count total of letters in the parameter
        } 
      System.out.print(Arrays.toString(result));   
      //print your result
      return result;
    }
    
}
