
import java.util.Scanner;

public class Student
{
    private String fName;
    private String lName;
    private int sNum;
    private String email;
    private String country;
    Scanner scan = new Scanner(System.in);


    public Student(String fName, String lName, int sNum, String email, String country){
        this.fName = fName;
        this.lName = lName;
        this.sNum = sNum;
        this.email = email;
        this.country= country;
        
    }
    public String getfName(){
        return this.fName;
    }
    public String getlName(){
        return this.lName;
    }
    public int getsNum(){
        return this.sNum;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCountry(){
        return this.country;
    }
}
