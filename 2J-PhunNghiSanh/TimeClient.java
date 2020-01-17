
/**
 * クラス TimeClient の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class TimeClient
{
    public static void main(){
        Time time = new Time(16,10,40.0);
        time.setHour(23);
        int result = time.getHour();
        System.out.println(result);
    }
}
