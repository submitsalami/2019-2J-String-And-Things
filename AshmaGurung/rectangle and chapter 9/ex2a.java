/**
 * クラス ex2a の注釈をここに書きます.
 * 
 * ashma gurung
 * @version (バージョン番号もしくは日付) */


import java.util.Arrays;
  public class ex2a{
      public static void main(String[]args){
        String a = "banana";
        char b = 'a';
        int count = 0;
        int i = 0;
        while(i < a.length()){
         if(a.charAt(i) == b){
           count++;   
         }
         i++;
        }
        System.out.println("a" +count);
    } 
}