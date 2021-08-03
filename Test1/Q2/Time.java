package Lab.Test1.Q2;

public abstract class Time{
    protected int seconds;
    protected int minutes;
    protected int hours;
    public Time(){
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }
    public Time(int sec, int min, int hours){
        this.seconds = sec;
        this.minutes = min;
        this.hours = hours;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getHours(){
        return this.hours;
    }
    public int display(){
        System.out.println("Hours:"+this.hours+" Minutes:"+this.minutes+" Seconds:"+this.seconds);
    }
}