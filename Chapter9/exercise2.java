import java.util.Arrays;
public class exercise2{
    public static void main(String[]args){
        
        //char []a ={'b','a','n','a','n','a'};
        String a ="banana";
        /*for(int i =0; i<a.length;i++){
            int a2 = Integer.parseInt(a[i]);
            System.out.print(a2 + " ");
        }*/
        // Creating array of string length 
        char[] ch = new char[a.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < a.length(); i++) { 
            ch[i] = a.charAt(i); 
        } 
        for (char c : ch) { 
            System.out.print(c); 
        } 
        System.out.print(Arrays.toString(letterHist(a)));
    }
    //Our first Sub-problem
    //1.Write a method called letterHist
    //2.takes a string as a parameter
    //3.returns a histogram(array)
    public static int[] letterHist(String s){
        //4. create array contain 26 elements
        int []t = new int[26];
        for(int i =0;i <t.length;i++){
           
           t[i]++;
        }
        return t;
    }
    
}