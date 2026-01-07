class Time{
    private int second;
    private int hour;
    private int minute;
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }

   

     public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        //we can controll the second value between 0-59
        if(second >= 0 && second < 60){
            this.second = second;
        }else{
            System.out.println("Invalid second value");
        }
        
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
       //we can controll the minute value between 0-59
        if(minute >= 0 && minute < 60){
             this.minute = minute;
        }else{
            System.out.println("Invalid minute value");
        }
    }


    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        //we can controll the hour value between 0-23
        if(hour >= 0 && hour < 24){
             this.hour = hour;
        }else{
            System.out.println("Invalid hour value");
        }
    }


}



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Time t1 = new Time(10, 20, 50);

        
        System.out.println("Second: " + t1.getSecond());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Hour: " + t1.getHour());
        

        
        t1.setSecond(70);
        t1.setMinute(45);
        t1.setHour(55);

        System.out.println("Updated Time:");
        
        System.out.println("Second: " + t1.getSecond());      
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Hour: " + t1.getHour());  
        

    }
}
