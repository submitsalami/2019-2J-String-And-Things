
/**
 * クラス Time の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Time
{
    private int hour;
    private int minute;
    private double seconds;
    
    public Time(int hour, int minute, double seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
        
    }
    
    
    
    public int getHour(){
        return this.hour;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public void setMinute(int Minute){
        this.minute = minute;
    }
    
    public double getSeconds(){
        return this.seconds;
    }
    
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
}
