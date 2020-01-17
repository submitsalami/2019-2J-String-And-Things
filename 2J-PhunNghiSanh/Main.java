
/**
 * クラス Main の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Main
{
    public static void main(){
        Student a = new Student("Sanh","Phun",187161,"vlpk10s","VN");
        
        System.out.println(a.getfName() + " " + a.getlName());
        System.out.println(a.getsNum());
    }
}
