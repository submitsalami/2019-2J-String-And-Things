public class EqualsExample {
 
    public static void main(String[] args) {
        String s1 = "Ahmed Jisan";
        String s2 = "Ahmed Kalan";
        String s3 = "Ahmed Jisan";
         
        System.out.println("s1 == s2: "+(s1 == s2));
        System.out.println("s1.equals(s2): "+(s1.equals(s2)));
        System.out.println("s1 == s3: "+(s1 == s3));
        System.out.println("s1.equals(s3): "+(s1.equals(s3)));
 
    }
 
}