
/**
 * クラス Person の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Person
{
    private String name;
    private int age, phone;
    
    public Person(String name, int age, int phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getPhone(){
        return this.phone;
    }
}
