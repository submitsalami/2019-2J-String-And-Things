
/**
 * クラス ex10の注釈をここに書きます.
 * string travasel
 * ashma gurung
 * @version (バージョン番号もしくは日付)
 */
public class ex10{
    public static void main(String[]args){
    String s = fruit("banana"); 
    System.out.println(s);
 }


 public static String fruit(String s){
     String r = " ";
     for(int i = s.length()-1;i >= 0;i--){
       r = r + s.charAt(i);   
     }
      
   return r;
 }
}
    

