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
        if(hour > 0 && hour <= 24){
             this.hour = hour;
        }else{
            System.out.println("Invalid hour value");
        }
    }


    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
       
        if(minute > 0 && minute < 60){
             this.minute = minute;
        }else{
            System.out.println("Invalid minute value");
        }
    }


    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second > 0 && second < 60){
            this.second = second;
        }else{
            System.out.println("Invalid second value");
        }
        
    }


}



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Time t1 = new Time(10, 20, 60);

        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        t1.setHour(55);
        t1.setMinute(45);
        t1.setSecond(50);
        System.out.println("Updated Time:");
        System.out.println("Hour: " + t1.getHour());        
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

    }
}
