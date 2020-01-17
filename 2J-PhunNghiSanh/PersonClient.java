
/**
 * クラス PersonClient の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class PersonClient
{
    public static void main(){
        Person person = new Person("Sanh",18,9900090);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Phone no: " + person.getPhone());
    }
}
