class Time{
    private int second;
    private int hour;
    private int minute;
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }


    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }


    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        this.second = second;
    }


}



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Time t1 = new Time(10, 20, 30);

        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
    }
}
